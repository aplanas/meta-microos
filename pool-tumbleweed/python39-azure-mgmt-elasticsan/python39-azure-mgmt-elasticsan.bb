SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-elasticsan-1.0.0b1-1.4.noarch.rpm"
RPM_HASH = "da7a85c1ff240eac13ae2665460b47b9c18ee3bf60273ca2d5ef4c7c23eaefde54eb8a470e9e4d208f251a47302ad1a76d1938c82ee14f8cf9349576cd573a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-elasticsan \
python39-azure-mgmt-elasticsan \
python3dist-azure-mgmt-elasticsan"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
