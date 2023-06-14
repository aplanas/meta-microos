SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python311-xlrd-2.0.1-1.9.noarch.rpm"
RPM_HASH = "c179af1bc8b2643a84defeea52a788953c8a6a1788c40ff8bb5070bbf88254bcd8a7e88f2255c24018336c67a6fabaacb784382f7f63bc8a617cabc16026a5e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xlrd \
python311-xlrd \
python3dist-xlrd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
