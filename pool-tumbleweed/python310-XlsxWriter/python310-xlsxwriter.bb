SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.0.3"

RPM_NAME = "python310-XlsxWriter-3.0.3-1.6.noarch.rpm"
RPM_HASH = "8a8cfb8f213d47fb3a257f2df74fb0e9d26b25749df607c650c71f711f928cfde205cfacedd5f46a502b376cec3e0efbca05f970247b26ec146a74c40451e4d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlsxwriter \
python3.10dist-xlsxwriter \
python310-XlsxWriter \
python3dist-xlsxwriter"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
