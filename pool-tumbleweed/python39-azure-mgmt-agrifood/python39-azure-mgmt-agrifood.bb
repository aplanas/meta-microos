SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python39-azure-mgmt-agrifood-1.0.0b3-1.4.noarch.rpm"
RPM_HASH = "1e821b949a52b9f5ae8126c89daa3bd92c6cf960c1e4c61504ab32712e38e571a0e00a6343b90e94bbb1962e47aceaaf072c874367fd5482cb8fc7bbb46af0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-agrifood \
python39-azure-mgmt-agrifood \
python3dist-azure-mgmt-agrifood"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
