SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python311-jupyter-collaboration-0.8.0-1.2.noarch.rpm"
RPM_HASH = "32bce72247eb17e1af4367c7126224c4d06e95b9606bf13c0d53c50b984df6ca9dc32508e033e0d344c3f2c58436b6cf31b28209d6cbb69659ab46b021ecb9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-server-ydoc) \
python311-jupyter-collaboration \
python311-jupyter-server-ydoc \
python311-jupyter_server_ydoc \
python3dist(jupyter-server-ydoc)"

RDEPENDS:${PN} += "(python311-jupyter_server_fileid >= 0.6.0 with python311-jupyter_server_fileid < 1) \
(python311-jupyter_ydoc >= 0.2.0 with python311-jupyter_ydoc < 0.4) \
(python311-ypy-websocket >= 0.8.2 with python311-ypy-websocket < 0.9) \
jupyter-jupyterlab-rtc \
python(abi)"

inherit rpm
