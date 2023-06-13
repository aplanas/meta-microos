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

RPM_NAME = "python310-pyramid-debugtoolbar-4.10-1.3.noarch.rpm"
RPM_HASH = "a0f0ee759886ea86b6305ed871038ef997b9f6516acb91c56b93f809ab4b60fb4696f6fa6798604f8e9f6718933a60c2e3b39fd699cd2b1d32550e07909540fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-debugtoolbar \
python3.10dist(pyramid-debugtoolbar) \
python310-pyramid-debugtoolbar \
python3dist(pyramid-debugtoolbar)"

RDEPENDS:${PN} += "python(abi) \
python310-Pygments \
python310-pyramid \
python310-pyramid-mako"

inherit rpm
