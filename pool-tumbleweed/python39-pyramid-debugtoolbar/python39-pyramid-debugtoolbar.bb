SUMMARY = "An interactive HTML debugger for Pyramid application development"
DESCRIPTION = "A package which provides an interactive HTML debugger for Pyramid application \
development. \
 \
Note that pyramid-debugtoolbar is a blatant rip-off of Michael van Tellingen's \
flask-debugtoolbar (which itself was derived from Rob Hudson's \
django-debugtoolbar). It also includes a lightly sanded down version of the \
Werkzeug debugger code by Armin Ronacher and team."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "4.10"

RPM_NAME = "python39-pyramid-debugtoolbar-4.10-1.3.noarch.rpm"
RPM_HASH = "d9c89a327e80295b38849c6c5c29ab01bebdd9dc79d2d847ce043cc6ae9a981b5e9ba6590dfb06d9c87b81c2aca1817ec0581dd3e18892d2085f693cbb7bd784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyramid-debugtoolbar) \
python39-pyramid-debugtoolbar \
python3dist(pyramid-debugtoolbar)"
RDEPENDS:${PN} += "python(abi) \
python39-Pygments \
python39-pyramid \
python39-pyramid-mako"

inherit rpm
