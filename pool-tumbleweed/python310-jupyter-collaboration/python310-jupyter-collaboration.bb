SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python310-jupyter-collaboration-1.0.0-2.1.noarch.rpm"
RPM_HASH = "2ddacdb970deccd3aa2f3bad70aaf0f4a8c1b3f83e0f0e7c7ec945cb62d5f3eaae70860e7f212195efa350d4f7d3805020c3f4e051d3b8e85fc64d570a9b2a0c"
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
