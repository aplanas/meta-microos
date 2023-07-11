SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python311-xlrd-2.0.1-1.11.noarch.rpm"
RPM_HASH = "b7013c581fd2141f39501b16dec16fd28a0ad816c948d2e23e70c3d86aa55d05ec8c25d71a187a5e33b07d7c9f1c69f91eb98f27bb4e94f1553758ef7fb0145c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlrd \
python3.11dist-xlrd \
python311-xlrd \
python3dist-xlrd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
