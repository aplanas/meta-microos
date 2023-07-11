SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python311-jupyterlab-4.0.2-1.2.noarch.rpm"
RPM_HASH = "6b464cabee0db988379768642bf36cbb726725a2b67e61d4c7d6a4fb4c2eacfb3aa8edd45c186e20d3230580f7dc23e685c1fa8ec6f73e038907383c7d9a4b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-jupyterlab \
python3-jupyterlab \
python3.11dist-jupyterlab \
python311-jupyter-jupyterlab \
python311-jupyterlab \
python3dist-jupyterlab"

RDEPENDS:${PN} += "-python311-jupyter-server >= 2.4.0 with python311-jupyter-server < 3 \
-python311-jupyterlab-server >= 2.19.0 with python311-jupyterlab-server < 3 \
/usr/bin/node \
jupyter-jupyterlab \
python-abi \
python311-Jinja2 \
python311-async-lru \
python311-ipykernel \
python311-jupyter-core \
python311-jupyter-lsp \
python311-notebook-shim \
python311-packaging \
python311-tornado \
python311-traitlets"

inherit rpm
