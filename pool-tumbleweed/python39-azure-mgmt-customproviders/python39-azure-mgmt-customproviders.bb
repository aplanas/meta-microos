SUMMARY = "Microsoft Azure CustomProviders Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure CustomProviders Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-customproviders-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "1584a412d60a2d4e64a33554897712645ee12b5e120e8ea4ddebb575c9678d1e7057ec44128c72e62aba44cdc4ab57b927e2e69d0cf075931ec2c766e667ee9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-customproviders \
python39-azure-mgmt-customproviders \
python3dist-azure-mgmt-customproviders"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
