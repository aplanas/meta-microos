SUMMARY = "Microsoft Azure Dataprotection Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dataprotection Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-dataprotection-1.1.0-1.1.noarch.rpm"
RPM_HASH = "3dc19efa006bc7ceb2e84dbe6d6ddaeacdd395d0313ff5fc1e80ddd73348750ca02b702af15b500b1ad14e55d4c8291b2526b6c1299865cc49fab7defeedf0e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-dataprotection \
python310-azure-mgmt-dataprotection \
python3dist-azure-mgmt-dataprotection"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
