SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-excel-2.0.2-4.1.noarch.rpm"
RPM_HASH = "3f37eb408b3d53c5468cebce2c47c03c1f2aae624da810bd0ec4fef36c5730f9dc5efd4e41b85e5edaa4f56bc929b964e20203d69bb64c1f6e3f655deb7e9022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-excel"

RDEPENDS:${PN} += "python310-XlsxWriter \
python310-odfpy \
python310-openpyxl \
python310-pandas \
python310-xlrd"

inherit rpm
