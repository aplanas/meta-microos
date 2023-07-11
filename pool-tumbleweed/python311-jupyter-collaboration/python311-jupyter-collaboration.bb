SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-jupyter-collaboration-1.0.0-1.2.noarch.rpm"
RPM_HASH = "9da6d1a1c631582ec2e9444f87a2af92646dbc7551cc5add7bfacf8df54b2772b7131f5d793f48be743185a8a7767dba5c155a0312bcf0f11b2b74b14af06b3d"
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
