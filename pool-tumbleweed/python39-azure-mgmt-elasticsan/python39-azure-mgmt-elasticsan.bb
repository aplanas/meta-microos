SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-elasticsan-1.0.0b2-1.1.noarch.rpm"
RPM_HASH = "6e5dafe4b183bad948ec020a568d39e3df1ee3e1f9c67465d67da497ac0d0c110cce4a650c9b8d7391bb2d1366eda124d007f322b10755204e8c8566d5c8d23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-elasticsan \
python39-azure-mgmt-elasticsan \
python3dist-azure-mgmt-elasticsan"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
