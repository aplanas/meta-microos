SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python39-jupyter-collaboration-0.8.0-1.2.noarch.rpm"
RPM_HASH = "69e6777029ffa52c1b04d95bee18df0b3eaa02fe06764d7c739f202938cbdc693e1846abf97e9f26a2329103cd60ab550536527f7283b9862dac3d01ee1e729b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-server-ydoc) \
python39-jupyter-collaboration \
python39-jupyter-server-ydoc \
python39-jupyter_server_ydoc \
python3dist(jupyter-server-ydoc)"

RDEPENDS:${PN} += "(python39-jupyter_server_fileid >= 0.6.0 with python39-jupyter_server_fileid < 1) \
(python39-jupyter_ydoc >= 0.2.0 with python39-jupyter_ydoc < 0.4) \
(python39-ypy-websocket >= 0.8.2 with python39-ypy-websocket < 0.9) \
jupyter-jupyterlab-rtc \
python(abi)"

inherit rpm
