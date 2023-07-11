SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-jupyter-collaboration-1.0.0-1.2.noarch.rpm"
RPM_HASH = "aa10b9010a834fe6c0fc923ee00178eab36fb87d4efbc76b870285ca7970e0161936aeb3bac132e1707ae405f5c8424302e4d8eb39f54b4ad8e421005494adf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-collaboration \
python39-jupyter-collaboration \
python3dist-jupyter-collaboration"

RDEPENDS:${PN} += "-python39-jupyter-server >= 2.0.0 with python39-jupyter-server < 3.0.0 \
-python39-jupyter-server-fileid >= 0.6.0 with python39-jupyter-server-fileid < 1 \
-python39-jupyter-ydoc >= 1.0.1 with python39-jupyter-ydoc < 2.0.0 \
-python39-ypy-websocket >= 0.8.3 with python39-ypy-websocket < 0.9.0 \
jupyter-collaboration \
python-abi \
python39-jupyter-events"

inherit rpm
