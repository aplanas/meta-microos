SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python310-xlrd-2.0.1-1.11.noarch.rpm"
RPM_HASH = "52051874ca0c5dd3dfcbd827c086904b8d0012d07a9906227bf93c86a2da745fccb1b10cdedd3a8cddfe38dd47c3347a606f6f5d0300658180fab1339fb6418a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xlrd \
python310-xlrd \
python3dist-xlrd"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
