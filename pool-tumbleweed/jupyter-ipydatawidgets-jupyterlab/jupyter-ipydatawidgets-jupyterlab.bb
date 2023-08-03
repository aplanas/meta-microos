SUMMARY = "JupyterLab Widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "7.1.2"

RPM_NAME = "jupyter-ipydatawidgets-jupyterlab-7.1.2-9.4.noarch.rpm"
RPM_HASH = "a5f7e18dbb56be95c892ba04db5a6534564b85e2d970d36127f5c4665c2a221c34fc51b1053d82a12da50c5782dd16e21378f659f9f0816344f182b26df66276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets-jupyterlab \
jupyter-ipydatawidgets-jupyterlab"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
jupyter-jupyterlab"

inherit rpm
