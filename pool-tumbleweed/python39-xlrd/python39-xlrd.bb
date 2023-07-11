SUMMARY = "Python module for extracting data from .xls Excel spreadsheet files"
DESCRIPTION = "A library for reading data and formatting information from Excel files \
in the historical .xls format."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python39-xlrd-2.0.1-1.11.noarch.rpm"
RPM_HASH = "097123b13c8582a8355acc02e836062abda74e0ffd101ec7e09feece41b436a31d0013ccf4b32cbf39f2627824b678bfbe68577e8afef1566458a95a0268d489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xlrd \
python39-xlrd \
python3dist-xlrd"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
