SUMMARY = "Read support for Excel files (xls and xlsx) for agate"
DESCRIPTION = "Agate-excel adds read support for Excel files (xls and xlsx) \
to agate."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python311-agate-excel-0.2.5-2.2.noarch.rpm"
RPM_HASH = "0bb2a7f4baa4c4eea6fe50d640ea059cc8fc15252886b47b5ca042bf9041c2e05d161e056f7cdced3f87301e8613c2a19cc97b500a04f63f05ac20c058d326be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-agate-excel \
python311-agate-excel \
python3dist-agate-excel"

RDEPENDS:${PN} += "python-abi \
python311-agate \
python311-olefile \
python311-openpyxl \
python311-six \
python311-xlrd"

inherit rpm
