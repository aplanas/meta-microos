SUMMARY = "Matplotlib JupyterLab Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-jupyterlab-0.11.3-10.1.noarch.rpm"
RPM_HASH = "18c0a9d1b4a78c98f4cd09d7d21d466aa7afcc968cc40eb475bf94d48f916a28cb6cc0ea2ff4056985bf7b981bcaaa9f5d0b54d3b816a433f38ba40309d3b462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl-jupyterlab \
jupyter-matplotlib-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist(ipympl)"

inherit rpm
