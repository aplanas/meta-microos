SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-4-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python310-xlwt-1.3.0-2.15.noarch.rpm"
RPM_HASH = "6c36782f45f495fcb53081642d5fc1877f0acbb827da57dc48994afe6696d9a801f2afc6eaad25140c118dc04e648c2072900c20516143ddb41f72cd4466dc60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlwt \
python3.10dist(xlwt) \
python310-xlwt \
python3dist(xlwt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
