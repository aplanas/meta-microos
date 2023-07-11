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

RPM_NAME = "python311-pyramid-debugtoolbar-4.10-1.5.noarch.rpm"
RPM_HASH = "a9fbdf56dee77e4a8d41ef3f7ff6d6700ad90b07310c1dc7a11fb560a9dcb4a8f501bd7bbbefa0f379ddde7d6c58690342e4114a4b98c439b1e00cc3a2e3891f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-debugtoolbar \
python3.11dist-pyramid-debugtoolbar \
python311-pyramid-debugtoolbar \
python3dist-pyramid-debugtoolbar"

RDEPENDS:${PN} += "python-abi \
python311-Pygments \
python311-pyramid \
python311-pyramid-mako"

inherit rpm
