SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.0.10"

RPM_NAME = "python39-openpyxl-3.0.10-1.5.noarch.rpm"
RPM_HASH = "e7c50ebc32bab13ed01b6cd44cfd2211a322bd860574c0813f702daaaa6f3a1e75540c2460be643d52fbeca347a5ae55630925de0a9503a8188cc09cac6ba5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openpyxl \
python39-openpyxl \
python3dist-openpyxl"

RDEPENDS:${PN} += "python-abi \
python39-et-xmlfile"

inherit rpm
