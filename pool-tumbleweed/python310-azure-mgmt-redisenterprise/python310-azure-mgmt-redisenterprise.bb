SUMMARY = "Microsoft Azure Redis Enterprise Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Redis Enterprise Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-redisenterprise-2.0.0-1.7.noarch.rpm"
RPM_HASH = "aa4b206fd0056fdaaa0a3ed811ba77e3f06aa8efe275ea5b3c1ca1f330a5e149e41a5d83d7eaacac7a5edc21e547a7b47cb827acde939fe1ec2256afd256ef7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-redisenterprise \
python310-azure-mgmt-redisenterprise \
python3dist-azure-mgmt-redisenterprise"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
