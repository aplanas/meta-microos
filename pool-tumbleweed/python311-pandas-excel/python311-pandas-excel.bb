SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-excel-2.0.3-1.3.noarch.rpm"
RPM_HASH = "04a8a43183d77220ff3a73e1b6205284f8f2c8181b3c41869bbe05bd69743dc90faa00d4c50f0e6bc8a8246b2a8bbfef7f77437214cd542b5f42971d9ec52eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-excel \
python311-pandas-excel"

RDEPENDS:${PN} += "python311-XlsxWriter \
python311-odfpy \
python311-openpyxl \
python311-pandas \
python311-xlrd"

inherit rpm
