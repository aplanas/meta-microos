SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-4-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python311-xlwt-1.3.0-2.15.noarch.rpm"
RPM_HASH = "24fb09503549acee000c6473c6678d1c42a3865afa219fa56ce9918e633e1c46b5b3b4d9c45b58bd218fa40ab3d7a4b239b9e45990e92d763d302360ad3f0950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xlwt) \
python311-xlwt \
python3dist(xlwt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
