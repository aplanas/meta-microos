SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python311-agate-excel-0.2.5-2.4.noarch.rpm"
RPM_HASH = "7d58edde9b93e22ac85d2cc124fdb3f1af1027420d473b7a3469b0ec1aba333dbe29aba3a18ecf7fdb4c0dfad262f20e535060f3dabcf073898999a8f5150471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-excel \
python3.11dist-agate-excel \
python311-agate-excel \
python3dist-agate-excel"

RDEPENDS:${PN} += "python-abi \
python311-agate \
python311-olefile \
python311-openpyxl \
python311-six \
python311-xlrd"

inherit rpm
