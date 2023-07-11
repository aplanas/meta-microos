SUMMARY = "JupyterLab Widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "7.1.2"

RPM_NAME = "jupyter-ipydatawidgets-jupyterlab-7.1.2-9.3.noarch.rpm"
RPM_HASH = "fab707acafc2e0e180dbec8d1e80901dd7376ff1fbbfbea1445b06b08b9749eb428391e74a6e4e8d782f9100559c134fa44ac36e1ad3e981737e30d6921ba069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets-jupyterlab \
jupyter-ipydatawidgets-jupyterlab"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
jupyter-jupyterlab"

inherit rpm
