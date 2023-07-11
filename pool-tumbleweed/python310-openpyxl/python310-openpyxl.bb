SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.0.10"

RPM_NAME = "python310-openpyxl-3.0.10-1.5.noarch.rpm"
RPM_HASH = "c3b07a88eb485ee4b180258b9eee47c44f92e488f635a97d5d0d3f5a7cd297f354e8400e704e03e245bac83aa0575dd548ba979ab111b20a0d66edaaefd7298a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openpyxl \
python310-openpyxl \
python3dist-openpyxl"

RDEPENDS:${PN} += "python-abi \
python310-et-xmlfile"

inherit rpm
