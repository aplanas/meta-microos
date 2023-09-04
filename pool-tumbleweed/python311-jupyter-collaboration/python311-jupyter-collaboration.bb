SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-jupyter-collaboration-1.0.0-2.1.noarch.rpm"
RPM_HASH = "3c8ce56c8a1f075ec66ea7ea762d5e3222cf9552f20fba9e70fc59b6f469021b7fd85317758dc5bfa93e6fc5f9940eab055590f5ed186d2d8d3150295e92809f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-collaboration \
python3.11dist-jupyter-collaboration \
python311-jupyter-collaboration \
python3dist-jupyter-collaboration"

RDEPENDS:${PN} += "-python311-jupyter-server >= 2.0.0 with python311-jupyter-server < 3.0.0 \
-python311-jupyter-server-fileid >= 0.6.0 with python311-jupyter-server-fileid < 1 \
-python311-jupyter-ydoc >= 1.0.1 with python311-jupyter-ydoc < 2.0.0 \
-python311-ypy-websocket >= 0.8.3 with python311-ypy-websocket < 0.9.0 \
jupyter-collaboration \
python-abi \
python311-jupyter-events"

inherit rpm
