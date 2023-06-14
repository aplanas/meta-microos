SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python311-jupyter-server-2.5.0-1.2.noarch.rpm"
RPM_HASH = "09c7c87072e785bd23fb34ccf9c328719ec121b74c6092135ed589620a3109f87481662003b5715a0e614ba91741fa6d0ea202f6a5ce0b39eeab91722208afbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-server \
python311-jupyter-server \
python3dist-jupyter-server"

RDEPENDS:${PN} += "-(python311-jupyter-core >= 4.12 with python311-jupyter-core < 5.0) or python311-jupyter-core >= 5.1 \
/bin/sh \
/usr/bin/python3.11 \
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
python311-packaging \
python311-prometheus-client \
python311-pyzmq \
python311-terminado \
python311-tornado \
python311-traitlets \
python311-websocket-client"

inherit rpm
