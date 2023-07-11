SUMMARY = "Microsoft Azure Scvmm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Scvmm Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python310-azure-mgmt-scvmm-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "c11b12260cc2be0e45add331b09f2aca609784baef55470aa2b635bef6346a280bab480fc7d28484412ca0121dea6b9b421a01d7dd0ef64db82ad1d28879ae37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-scvmm \
python310-azure-mgmt-scvmm \
python3dist-azure-mgmt-scvmm"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
