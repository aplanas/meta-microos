SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "python311-jupyter-server-2.7.2-1.1.noarch.rpm"
RPM_HASH = "81e9e4116ed24e30700b67c2a73018cccc1f8db8dcab8df6f007c8a30e66ec79f3897a3b8a9394ecb72081ae5fe74c84b67ac39431db3701f3f8d697cc8dd084"
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
