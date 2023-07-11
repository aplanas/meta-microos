SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python310-jupyter-collaboration-1.0.0-1.2.noarch.rpm"
RPM_HASH = "eb62a2df8669066b94a3ca5423ac41cc0f23f10537fcd389bc80e15d02f14cbaac192fd5be8ebb2726ee8f54bceddce86fd1a23a92eaa66372efd2ae1fedff0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-collaboration \
python310-jupyter-collaboration \
python3dist-jupyter-collaboration"

RDEPENDS:${PN} += "-python310-jupyter-server >= 2.0.0 with python310-jupyter-server < 3.0.0 \
-python310-jupyter-server-fileid >= 0.6.0 with python310-jupyter-server-fileid < 1 \
-python310-jupyter-ydoc >= 1.0.1 with python310-jupyter-ydoc < 2.0.0 \
-python310-ypy-websocket >= 0.8.3 with python310-ypy-websocket < 0.9.0 \
jupyter-collaboration \
python-abi \
python310-jupyter-events"

inherit rpm
