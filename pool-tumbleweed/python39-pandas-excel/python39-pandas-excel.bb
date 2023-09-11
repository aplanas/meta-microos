SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-excel-2.0.3-1.3.noarch.rpm"
RPM_HASH = "9eff91ec88c62eb24803d68775d19d191a9dc6655cda50ed3bb83ad78ff8ed1a2e8e0592375fa6116d13dc62375f3aba2dab34bb42d50ca297a441f409b17bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-excel"

RDEPENDS:${PN} += "python39-XlsxWriter \
python39-odfpy \
python39-openpyxl \
python39-pandas \
python39-xlrd"

inherit rpm
