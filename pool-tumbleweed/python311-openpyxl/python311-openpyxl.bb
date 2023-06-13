SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.0.10"

RPM_NAME = "python311-openpyxl-3.0.10-1.3.noarch.rpm"
RPM_HASH = "61740cee33b02f584ce5f91b5b8fd33f799075abb355c462823d13ed2294ad38147af05be269f0da92dcc6f5bfe05a501fe6b82535845f77ca388366a8348457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(openpyxl) \
python311-openpyxl \
python3dist(openpyxl)"

RDEPENDS:${PN} += "python(abi) \
python311-et_xmlfile"

inherit rpm
