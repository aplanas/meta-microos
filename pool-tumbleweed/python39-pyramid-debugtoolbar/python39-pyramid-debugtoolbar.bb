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

RPM_NAME = "python39-pyramid-debugtoolbar-4.10-1.5.noarch.rpm"
RPM_HASH = "24224d89045fe6880cbe3881ef675a4bc074c0f2b79754f3c0423148d31a0ffbc4eeba1303f4a99de8dbd3466c65a16eace04385c5f6033e52f053027c9552d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyramid-debugtoolbar \
python39-pyramid-debugtoolbar \
python3dist-pyramid-debugtoolbar"

RDEPENDS:${PN} += "python-abi \
python39-Pygments \
python39-pyramid \
python39-pyramid-mako"

inherit rpm
