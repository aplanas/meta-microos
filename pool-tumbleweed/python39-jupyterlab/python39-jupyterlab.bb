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

RPM_NAME = "python39-jupyterlab-4.0.2-1.2.noarch.rpm"
RPM_HASH = "71e2bf14b58675599cd4e4d9e22194e1cdb0786f750678e2d2bb726ae24c9f138991a4c3742430e433a9f690eddfc29cdbb04d7dd7b8610a1d1378820e508419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab \
python39-jupyter-jupyterlab \
python39-jupyterlab \
python3dist-jupyterlab"

RDEPENDS:${PN} += "-python39-jupyter-server >= 2.4.0 with python39-jupyter-server < 3 \
-python39-jupyterlab-server >= 2.19.0 with python39-jupyterlab-server < 3 \
/usr/bin/node \
jupyter-jupyterlab \
python-abi \
python39-Jinja2 \
python39-async-lru \
python39-ipykernel \
python39-jupyter-core \
python39-jupyter-lsp \
python39-notebook-shim \
python39-packaging \
python39-tornado \
python39-traitlets"

inherit rpm
