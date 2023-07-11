SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.0.10"

RPM_NAME = "python311-openpyxl-3.0.10-1.5.noarch.rpm"
RPM_HASH = "be1329e253f1b61c1ceb9981f68f4262204907c36d7d96b74714642b0da0d6722a54fbd830204edeccf7f3c783785f83c7ad1d642e2ea659fa2be841f6a3c4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openpyxl \
python3.11dist-openpyxl \
python311-openpyxl \
python3dist-openpyxl"

RDEPENDS:${PN} += "python-abi \
python311-et-xmlfile"

inherit rpm
