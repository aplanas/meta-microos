SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "3.6.3"

RPM_NAME = "python39-jupyterlab-3.6.3-1.1.noarch.rpm"
RPM_HASH = "51ef50d182824a880b18a523a541b6c8cd3dd41b0015d6ddf05445faf389805dabbc260f6e699b8a6efbf3661389db549806e273dc78c23e248660257dc92607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyterlab) \
python39-jupyter_jupyterlab \
python39-jupyterlab \
python3dist(jupyterlab)"

RDEPENDS:${PN} += "(python39-jupyter-server-ydoc >= 0.8 with python39-jupyter-server-ydoc < 0.9) \
(python39-jupyter-ydoc >= 0.2.3 with python39-jupyter-ydoc < 0.3) \
(python39-jupyter_server >= 1.16 with python39-jupyter_server < 3) \
(python39-tomli if python39-base < 3.11) \
/usr/bin/node \
jupyter-jupyterlab \
python(abi) \
python39-Jinja2 \
python39-ipython \
python39-jupyter_core \
python39-jupyterlab-server \
python39-nbclassic \
python39-notebook \
python39-packaging \
python39-tornado"

inherit rpm
