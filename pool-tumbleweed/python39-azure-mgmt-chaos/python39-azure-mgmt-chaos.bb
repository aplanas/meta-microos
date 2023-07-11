SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python39-azure-mgmt-chaos-1.0.0b6-1.4.noarch.rpm"
RPM_HASH = "b7575c8ac53a7c47296602e829a9338b1d18c5ca21e93631a126ad20a2c0c2b8096458ffda3618e1adf33e4996794a6597eb8d59c7febc0939abdf57d055cc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-chaos \
python39-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
