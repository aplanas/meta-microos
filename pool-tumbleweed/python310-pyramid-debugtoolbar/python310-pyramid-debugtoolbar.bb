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

RPM_NAME = "python310-pyramid-debugtoolbar-4.10-1.5.noarch.rpm"
RPM_HASH = "95611ebb40abafe0ee54dcb17f5e482e5142045539ae5df255fe2a233d09271536ea646399c6cb6e2db2d13230b10f139bfa2a5570476102b181283ae0aedf97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyramid-debugtoolbar \
python310-pyramid-debugtoolbar \
python3dist-pyramid-debugtoolbar"

RDEPENDS:${PN} += "python-abi \
python310-Pygments \
python310-pyramid \
python310-pyramid-mako"

inherit rpm
