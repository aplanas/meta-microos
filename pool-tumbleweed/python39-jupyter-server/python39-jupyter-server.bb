SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-jupyter-server-2.6.0-1.3.noarch.rpm"
RPM_HASH = "68024bc5eeadfa81e2dcd452fb33bf98e04bf1a755405b7e75776b35e6919ecc1910303162a427a9e211633f66816451be07ecce993c05bfeacc8b1f3e4752af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-server \
python39-jupyter-server \
python3dist-jupyter-server"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
python39-overrides \
python39-packaging \
python39-prometheus-client \
python39-pyzmq \
python39-terminado \
python39-tornado \
python39-traitlets \
python39-websocket-client"

inherit rpm
