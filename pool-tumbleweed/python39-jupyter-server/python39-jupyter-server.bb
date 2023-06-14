SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "python39-jupyter-server-2.5.0-1.2.noarch.rpm"
RPM_HASH = "c04859aa7f70f2d962b998002a022e102c42b54c2d862e1e7b17a599ca37329a63a72a93770f49c9fa8970768b31106916d5efa661a0ca1407589c95cf863eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-server \
python39-jupyter-server \
python3dist-jupyter-server"

RDEPENDS:${PN} += "-(python39-jupyter-core >= 4.12 with python39-jupyter-core < 5.0) or python39-jupyter-core >= 5.1 \
/bin/sh \
/usr/bin/python3.9 \
alts \
python-abi \
python39 \
python39-Jinja2 \
python39-Send2Trash \
python39-anyio \
python39-argon2-cffi \
python39-jupyter-client \
python39-jupyter-events \
python39-jupyter-server-terminals \
python39-nbconvert \
python39-nbformat \
python39-packaging \
python39-prometheus-client \
python39-pyzmq \
python39-terminado \
python39-tornado \
python39-traitlets \
python39-websocket-client"

inherit rpm
