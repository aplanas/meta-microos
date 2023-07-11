SUMMARY = "Python module for writing OOXML spreadsheet files"
DESCRIPTION = "XlsxWriter is a Python module for writing files in the Microsoft \
Office Open XML spreadsheet format. It can be used to write text, \
numbers, formulas and hyperlinks to multiple worksheets and it \
supports features such as formatting and many more."
LICENSE = "BSD-2-Clause"

PV = "3.0.3"

RPM_NAME = "python311-XlsxWriter-3.0.3-1.6.noarch.rpm"
RPM_HASH = "e664603c61b16859c49f19665b2dd486df8623fbe20d10e6e94a87144e23c6a6cf3791e396813fbbf6a51615b847a98bf2dd7d52248f0b4374f9d64d6cb15800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XlsxWriter \
python3-xlsxwriter \
python3.11dist-xlsxwriter \
python311-XlsxWriter \
python3dist-xlsxwriter"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
