SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python310-agate-excel-0.2.5-2.4.noarch.rpm"
RPM_HASH = "4fc2f76f4e01c0577cbc68dd5aed4916b6d6b928e9de01f05e702a66611fcc205776a74a66937916277564cb155adfb280456228f8c2dae6161978d5b10c8b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-agate-excel \
python310-agate-excel \
python3dist-agate-excel"

RDEPENDS:${PN} += "python-abi \
python310-agate \
python310-olefile \
python310-openpyxl \
python310-six \
python310-xlrd"

inherit rpm
