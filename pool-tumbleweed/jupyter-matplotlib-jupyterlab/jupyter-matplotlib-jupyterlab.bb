SUMMARY = "Matplotlib JupyterLab Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-jupyterlab-0.11.3-10.3.noarch.rpm"
RPM_HASH = "a305cf43693640fc8a18e65302a7f550fbdc0c335712f3bd89f3951c51d238d4efe586fa22996f4f0896a9cc7802d6b007e08198b53f29d260fcb366b6665bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl-jupyterlab \
jupyter-matplotlib-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipympl"

inherit rpm
