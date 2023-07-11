SUMMARY = "Matplotlib JupyterLab Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "0.11.3"

RPM_NAME = "jupyter-matplotlib-jupyterlab-0.11.3-10.2.noarch.rpm"
RPM_HASH = "800809f4c01d0a8b69f7c096136b662480dde04c74c8ed33310c5d80e8973da8cbfe712ad3805da6dce933ab25e3277783d0b5062af990477796e5dfbf6f286f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipympl-jupyterlab \
jupyter-matplotlib-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipympl"

inherit rpm
