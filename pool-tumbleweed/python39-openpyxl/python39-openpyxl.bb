SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.0.10"

RPM_NAME = "python39-openpyxl-3.0.10-1.3.noarch.rpm"
RPM_HASH = "cc361fd8c682b0e770acbfb4f74036755579ed3fe83916876433828a193c5802123266563d585c6f6cfdd68e6f2bb2226358ea12d8d853419e6850e1140d5cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openpyxl) \
python39-openpyxl \
python3dist(openpyxl)"

RDEPENDS:${PN} += "python(abi) \
python39-et_xmlfile"

inherit rpm
