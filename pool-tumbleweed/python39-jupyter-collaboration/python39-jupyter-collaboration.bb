SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-jupyter-collaboration-1.0.0-2.1.noarch.rpm"
RPM_HASH = "3dacfc1a025eee034ce4481f7c0e75dde54b03b9e060bf1e849fde20a06b747f31e30699e4421654df584ba9021d546da5d332a2da49a5c3b4e86a94ae958e4a"
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
