SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "5.5.2"

RPM_NAME = "jupyter-ipydatawidgets-5.5.2-9.4.noarch.rpm"
RPM_HASH = "e74f4229d0090277826ba494eec4759bd4d3c0cbffa76f88560e2c6ba982b26b4a34bd4b6d45651093b48a7770eca25f04ed4a35f157e238f83f30936c4eb1e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets \
jupyter-ipydatawidgets"

RDEPENDS:${PN} += "jupyter-notebook \
python3-ipydatawidgets"

inherit rpm
