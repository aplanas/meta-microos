SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.0.3"

RPM_NAME = "python310-XlsxWriter-3.0.3-1.4.noarch.rpm"
RPM_HASH = "46f8faef124c39285addcf674ce1ff73b2c5792a7cdb1efc0ba064b1f3a470fb90ebafed20e1b4e2201034be9d7d41440a3344aad01f8c1717c345786930c695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XlsxWriter \
python3-xlsxwriter \
python3.10dist(xlsxwriter) \
python310-XlsxWriter \
python3dist(xlsxwriter)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
