SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python310-jupyter-server-2.5.0-1.2.noarch.rpm"
RPM_HASH = "732bb13934c679d925e11f1f683c8cee774611583256d3efc3406739324cec869ed1072b1573200e292f16030a93625ec87204196e7afb7a8c126dcdaa5236ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-server \
python3-jupyter-server \
python3.10dist-jupyter-server \
python310-jupyter-server \
python3dist-jupyter-server"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310 \
python310-Jinja2 \
python310-Send2Trash \
python310-anyio \
python310-argon2-cffi \
python310-jupyter-client \
python310-jupyter-events \
python310-jupyter-server-terminals \
python310-nbconvert \
python310-nbformat \
python310-packaging \
python310-prometheus-client \
python310-pyzmq \
python310-terminado \
python310-tornado \
python310-traitlets \
python310-websocket-client"

inherit rpm
