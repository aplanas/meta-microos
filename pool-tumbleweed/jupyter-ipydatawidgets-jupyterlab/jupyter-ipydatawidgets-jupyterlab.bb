SUMMARY = "JupyterLab Widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "7.1.2"

RPM_NAME = "jupyter-ipydatawidgets-jupyterlab-7.1.2-9.2.noarch.rpm"
RPM_HASH = "5d65350a65022b7fae6b8561d62ad2ecfa1fd5d9b55ffa05184b50084c182e6a2f4a97c44c42b9b8f9ae24d18996f1efc4c9f0ba961dacca11084b391d404759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets-jupyterlab \
jupyter-ipydatawidgets-jupyterlab"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
jupyter-jupyterlab"

inherit rpm
