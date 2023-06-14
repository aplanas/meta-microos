SUMMARY = "Microsoft Azure Chaos Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Chaos Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python310-azure-mgmt-chaos-1.0.0b6-1.3.noarch.rpm"
RPM_HASH = "3572bd1860e3f8a4e768859730f80c13fc913adf5849572672e10a771b1311c3fbd257f16d044d3d0288c7f67f2e25a36ce5d493695518032990edb28b7b7deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-chaos \
python3.10dist-azure-mgmt-chaos \
python310-azure-mgmt-chaos \
python3dist-azure-mgmt-chaos"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
