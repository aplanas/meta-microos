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

RPM_NAME = "python310-jupyterlab-4.0.2-1.2.noarch.rpm"
RPM_HASH = "83f74ec5782f90fe3c1f2e7c2b5a882bd516620d55fff53223e8fcc464a0bfbd34ddaf958f42921e6e103ed78c906214634696482bcd2e3b7cf59808217373ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyterlab \
python310-jupyter-jupyterlab \
python310-jupyterlab \
python3dist-jupyterlab"

RDEPENDS:${PN} += "-python310-jupyter-server >= 2.4.0 with python310-jupyter-server < 3 \
-python310-jupyterlab-server >= 2.19.0 with python310-jupyterlab-server < 3 \
/usr/bin/node \
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
python310-traitlets"

inherit rpm
