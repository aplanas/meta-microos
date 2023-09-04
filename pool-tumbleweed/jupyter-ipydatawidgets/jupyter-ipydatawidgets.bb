SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "5.5.2"

RPM_NAME = "jupyter-ipydatawidgets-5.5.2-10.1.noarch.rpm"
RPM_HASH = "97a17966985607d9284728569571c5129387a885d4b3b8b2cb22954381e3730cdb2c1869db75eaf5e314f56b21abeaacb01d27bdcd5d583e97250bb0d6f3cffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets \
jupyter-ipydatawidgets"

RDEPENDS:${PN} += "python3dist-ipydatawidgets"

inherit rpm
