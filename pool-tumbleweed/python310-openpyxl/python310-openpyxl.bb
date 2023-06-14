SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.0.10"

RPM_NAME = "python310-openpyxl-3.0.10-1.3.noarch.rpm"
RPM_HASH = "85031db8b23e0dd5c2a17b2e90fb57ad980f8006b7a1de095f4a1a3849ceabd9b1c08d4b2bbcb688e74879e6e08dd47738980729aaa03c60a477deee90a9e835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openpyxl \
python3.10dist-openpyxl \
python310-openpyxl \
python3dist-openpyxl"

RDEPENDS:${PN} += "python-abi \
python310-et-xmlfile"

inherit rpm
