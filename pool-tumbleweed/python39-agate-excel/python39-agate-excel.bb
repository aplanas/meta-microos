SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python39-agate-excel-0.2.5-2.2.noarch.rpm"
RPM_HASH = "b12c3d9ab2f0f5bdcc274bac4c15ef1e3c7f5e243300d2023bc0712958a2d32852602e6b5048b1bde77b15007aaa80d17f343ad237010edab3da2238ad474adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(agate-excel) \
python39-agate-excel \
python3dist(agate-excel)"

RDEPENDS:${PN} += "python(abi) \
python39-agate \
python39-olefile \
python39-openpyxl \
python39-six \
python39-xlrd"

inherit rpm
