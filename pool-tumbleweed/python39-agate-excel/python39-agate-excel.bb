SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python39-agate-excel-0.2.5-2.4.noarch.rpm"
RPM_HASH = "8b76348c410627dbffe6ba03d9c0ec21693cb5e5e0553a84bd585c1e67385acaf62c07cb746857dc77bcce30e1837833d9bf86a605764c02ff826464acdc7bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate-excel \
python39-agate-excel \
python3dist-agate-excel"

RDEPENDS:${PN} += "python-abi \
python39-agate \
python39-olefile \
python39-openpyxl \
python39-six \
python39-xlrd"

inherit rpm
