SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python310-agate-excel-0.2.5-2.2.noarch.rpm"
RPM_HASH = "2def82347496a67d1f1ed570ac1a26c4cdc091fb5523f819f17f4134eaf7ec3dc99eb70cfb0add2cce6c46adc50ef215378950e0cb0a5bb89160f5b16281c7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-excel \
python3.10dist(agate-excel) \
python310-agate-excel \
python3dist(agate-excel)"

RDEPENDS:${PN} += "python(abi) \
python310-agate \
python310-olefile \
python310-openpyxl \
python310-six \
python310-xlrd"

inherit rpm
