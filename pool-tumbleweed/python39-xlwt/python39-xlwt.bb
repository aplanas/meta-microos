SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-4-Clause & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python39-xlwt-1.3.0-2.15.noarch.rpm"
RPM_HASH = "4b4f97a1a32713fec20bde25e5b3514af969b6d694c14649f6314bdd2fc3366eb212136cc83216786aeb402182fc03f4381fff26ee46b6cd2672a80bb68b461c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xlwt) \
python39-xlwt \
python3dist(xlwt)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
