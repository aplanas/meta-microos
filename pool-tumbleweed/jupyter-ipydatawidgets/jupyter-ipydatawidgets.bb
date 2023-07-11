SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "5.5.2"

RPM_NAME = "jupyter-ipydatawidgets-5.5.2-9.3.noarch.rpm"
RPM_HASH = "36b5e7848465d79fef192366a0d4e1106ddc90b611db27c28f29ad82ac32dd726263660913a3a9f8c6baabf6cc32b4e04bd8f56563e873238497c440565967de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-datawidgets \
jupyter-ipydatawidgets"

RDEPENDS:${PN} += "jupyter-notebook \
python3-ipydatawidgets"

inherit rpm
