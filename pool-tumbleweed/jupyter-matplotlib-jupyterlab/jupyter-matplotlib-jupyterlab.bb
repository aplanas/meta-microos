SUMMARY = "Matplotlib JupyterLab Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-jupyterlab-0.11.3-11.1.noarch.rpm"
RPM_HASH = "28e2ea0c18d93e0ac72316eda0894d6304c12ef916b011445cc81cd375b2a86854989fd9605735cc8256e49007db0bc42445b2efc5d708a2f6774b7a0ef13cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl-jupyterlab \
jupyter-matplotlib-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipympl"

inherit rpm
