SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "4.0.5"

RPM_NAME = "python311-jupyterlab-4.0.5-2.1.noarch.rpm"
RPM_HASH = "8ec69adc01abde0cebc56b6fa36029c5231f2fb7eda89aa495b8e0620e4c3a7d5b69c1146058da51e8c10f7c82dd21a1034d3932bb4d20398c6ad629547905d2"
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
/usr/bin/python3.11 \
/usr/bin/sh \
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
python311-traitlets \
update-alternatives"

inherit rpm
