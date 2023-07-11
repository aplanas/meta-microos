SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-4-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python310-xlwt-1.3.0-2.16.noarch.rpm"
RPM_HASH = "e1dae06803dd870082d8390ad0a42e1b0bf09ec9e984142a9ce337bed88f79ed78fe8474b21cb4f7c71e4b79082947522937b8006cfbea1d22af80bb3554afd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xlwt \
python310-xlwt \
python3dist-xlwt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
