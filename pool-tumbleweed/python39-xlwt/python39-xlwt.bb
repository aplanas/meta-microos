SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-4-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python39-xlwt-1.3.0-2.16.noarch.rpm"
RPM_HASH = "a6d6a465d882234de6b70a2944c66ce107c2de4761318d2642e108d4dcf647ef0e712e236db73f142477750a34e5d3c2f51611b7aa073488b624d501e36a5b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xlwt \
python39-xlwt \
python3dist-xlwt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
