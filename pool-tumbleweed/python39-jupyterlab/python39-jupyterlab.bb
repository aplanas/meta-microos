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

RPM_NAME = "python39-jupyterlab-4.0.5-2.1.noarch.rpm"
RPM_HASH = "1506df775af8928fe81fd0dbe0d2df050a791ebb2d68a8a2573221686d075eb48ad1f43fb1e454c7fd476426cee0ce3196081a02b9441716a44377b65b27c0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyterlab \
python39-jupyter-jupyterlab \
python39-jupyterlab \
python3dist-jupyterlab"

RDEPENDS:${PN} += "-python39-jupyter-server >= 2.4.0 with python39-jupyter-server < 3 \
-python39-jupyterlab-server >= 2.19.0 with python39-jupyterlab-server < 3 \
/usr/bin/node \
/usr/bin/python3.9 \
/usr/bin/sh \
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
python39-traitlets \
update-alternatives"

inherit rpm
