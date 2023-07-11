SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-excel-2.0.2-4.1.noarch.rpm"
RPM_HASH = "6006b8cae87418c6070385753455bcff572f2599cfa8f650f0e6a712aca40a9a149900622298d2b04a1a75637ce96c5b0dc91976e7144d96fd7214f025219b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-excel"

RDEPENDS:${PN} += "python39-XlsxWriter \
python39-odfpy \
python39-openpyxl \
python39-pandas \
python39-xlrd"

inherit rpm
