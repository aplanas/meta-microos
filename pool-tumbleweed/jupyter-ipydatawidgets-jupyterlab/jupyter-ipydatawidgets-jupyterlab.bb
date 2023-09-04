SUMMARY = "JupyterLab Widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "7.1.2"

RPM_NAME = "jupyter-ipydatawidgets-jupyterlab-7.1.2-10.1.noarch.rpm"
RPM_HASH = "523ad3c22ab90ff9e97a33b2b0838487d95031683d65ec188b3c5a6b2251cbefc8acb661e331bfcfc45a3700c338ec85d6d12e46dc07bb28fe365fcdfcfa7404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets-jupyterlab \
jupyter-ipydatawidgets-jupyterlab"

RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist-ipydatawidgets"

inherit rpm
