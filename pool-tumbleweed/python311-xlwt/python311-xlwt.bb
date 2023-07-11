SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-4-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python311-xlwt-1.3.0-2.16.noarch.rpm"
RPM_HASH = "ef6e4f1611445120704fa22a729b24f724b79c5984a8fe5cc43e48dcffa5d2fee792f8cd80f04f37971019ef46749b88869134faedf9038ca227bfd50b32249b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlwt \
python3.11dist-xlwt \
python311-xlwt \
python3dist-xlwt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
