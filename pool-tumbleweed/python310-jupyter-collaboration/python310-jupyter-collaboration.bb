SUMMARY = "Jupyter Server Extension Providing Y Documents"
DESCRIPTION = "A Jupyter Server Extension Providing Y Documents."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "python310-jupyter-collaboration-0.8.0-1.2.noarch.rpm"
RPM_HASH = "01b4a59b0418bbd5b6c083292100abd300b4b617cfb8b5ff3400c684fac4e09a62c5fb2411b364d7bb15fb1473b4a6d951c44bd2e6594a416d8b40b9f2923ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-collaboration \
python3-jupyter-server-ydoc \
python3-jupyter_server_ydoc \
python3.10dist(jupyter-server-ydoc) \
python310-jupyter-collaboration \
python310-jupyter-server-ydoc \
python310-jupyter_server_ydoc \
python3dist(jupyter-server-ydoc)"
RDEPENDS:${PN} += "(python310-jupyter_server_fileid >= 0.6.0 with python310-jupyter_server_fileid < 1) \
(python310-jupyter_ydoc >= 0.2.0 with python310-jupyter_ydoc < 0.4) \
(python310-ypy-websocket >= 0.8.2 with python310-ypy-websocket < 0.9) \
jupyter-jupyterlab-rtc \
python(abi)"

inherit rpm
