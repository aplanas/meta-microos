SUMMARY = "The python pandas[excel] extra"
DESCRIPTION = "This package provides the [excel] extra for python-pandas. \
(Except for pyxlsb, which is not available as openSUSE rpm package)"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-excel-2.1.0-1.2.noarch.rpm"
RPM_HASH = "e73aa25a51b781b17f481ef9959369d60a9d01439ebd64f9b7a56807f0a51f2c38ffe2d1bf91f7716007339e1ac7a3be4b52944e6eb7d22a3892edbfb65ae5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-excel \
python311-pandas-excel"

RDEPENDS:${PN} += "python311-XlsxWriter \
python311-odfpy \
python311-openpyxl \
python311-pandas \
python311-xlrd"

inherit rpm
