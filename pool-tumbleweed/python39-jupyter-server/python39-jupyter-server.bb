SUMMARY = "The backend to Jupyter web applications"
DESCRIPTION = "The Jupyter Server is a web application that allows you to create and \
share documents that contain live code, equations, visualizations, and \
explanatory text. The Notebook has support for multiple programming \
languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python39-jupyter-server-2.6.0-1.4.noarch.rpm"
RPM_HASH = "e352df3b5aae21dc74f80edac28b5a3141cc7fe4fbf568b28ce757ec686f351c305ea3a41b2e028d29a984f21f8a28c9a52ffb0a3320611f36d271fd1ffb1854"
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
