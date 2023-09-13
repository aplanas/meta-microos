SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-excel-2.1.0-1.2.noarch.rpm"
RPM_HASH = "628698639554bcad8668f1cc2f43ac365c0ed51ad5f1a791b201ac6f8966bb116c732032bba8c9b59ace4824e8041798efab99a1bfefb4488c71877efa12adf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-excel"

RDEPENDS:${PN} += "python310-XlsxWriter \
python310-odfpy \
python310-openpyxl \
python310-pandas \
python310-xlrd"

inherit rpm
