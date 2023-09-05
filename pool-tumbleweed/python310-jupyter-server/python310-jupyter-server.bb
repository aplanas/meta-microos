SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "python310-jupyter-server-2.7.2-1.1.noarch.rpm"
RPM_HASH = "5efd5bbbfea9ef6c5b46e4ab1173e466b4befb9694ee8ca347cd877eaf4203c8539ed50949f636d539305e79c67dacf4b8172bce6bf1207bb6e474ce7b19ae7c"
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
