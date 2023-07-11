SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python311-jupyter-server-2.6.0-1.3.noarch.rpm"
RPM_HASH = "0a071c268fd59437cd691e9ed850a794841426d8201c2b2c16895a79e9473e57e9323f9dd966e794e2cae16f6ab99fd1fb2109658b044e0fa67cae10405e7318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-server \
python3-jupyter-server \
python3.11dist-jupyter-server \
python311-jupyter-server \
python3dist-jupyter-server"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311 \
python311-Jinja2 \
python311-Send2Trash \
python311-anyio \
python311-argon2-cffi \
python311-jupyter-client \
python311-jupyter-events \
python311-jupyter-server-terminals \
python311-nbconvert \
python311-nbformat \
python311-overrides \
python311-packaging \
python311-prometheus-client \
python311-pyzmq \
python311-terminado \
python311-tornado \
python311-traitlets \
python311-websocket-client"

inherit rpm
