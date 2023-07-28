SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python310-jupyter-server-2.6.0-1.4.noarch.rpm"
RPM_HASH = "85c2376062345e63c5beb9e5c2cb48fa943a622b9b2dde48dca4f141b40728686410128ae89ef1807966bea541eef699818db3841562e64216bf9b5ac10d82d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-server \
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
python310-overrides \
python310-packaging \
python310-prometheus-client \
python310-pyzmq \
python310-terminado \
python310-tornado \
python310-traitlets \
python310-websocket-client"

inherit rpm
