SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python311-jupyter-server-2.6.0-1.5.noarch.rpm"
RPM_HASH = "52a0a007f9648ee2f08a8f757a25d7dc7822d9381b3e16453fab85f9f4d5bb434f2708fe42cf1910ea588c308daf81ee13c29a8b4ded1c74a27cc01caf9cc6a8"
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
