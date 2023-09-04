SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-excel-2.0.3-1.2.noarch.rpm"
RPM_HASH = "92406ba819060149141a05781306a6d2ab278f66dba8a90189ede71e2ba595a1d52c79a92ac09bb523fe60d50daca22eae01779cb704f6febc82cfd8f51dc648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-excel"

RDEPENDS:${PN} += "python39-XlsxWriter \
python39-odfpy \
python39-openpyxl \
python39-pandas \
python39-xlrd"

inherit rpm
