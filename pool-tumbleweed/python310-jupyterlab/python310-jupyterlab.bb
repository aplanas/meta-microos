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

RPM_NAME = "python310-jupyterlab-4.0.5-2.1.noarch.rpm"
RPM_HASH = "2c3b7d7c98d8de715642386843cebf9466bfda98d0d6d0089b3a7567d4ec73efa135ecaf66d5a546863fcc71733931bf7ed79771936bb2e38b134a743b6c0870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab \
python310-jupyter-jupyterlab \
python310-jupyterlab \
python3dist-jupyterlab"

RDEPENDS:${PN} += "-python310-jupyter-server >= 2.4.0 with python310-jupyter-server < 3 \
-python310-jupyterlab-server >= 2.19.0 with python310-jupyterlab-server < 3 \
/usr/bin/node \
/usr/bin/python3.10 \
/usr/bin/sh \
jupyter-jupyterlab \
python-abi \
python310-Jinja2 \
python310-async-lru \
python310-ipykernel \
python310-jupyter-core \
python310-jupyter-lsp \
python310-notebook-shim \
python310-packaging \
python310-tornado \
python310-traitlets \
update-alternatives"

inherit rpm
