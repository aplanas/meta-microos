SUMMARY = "Microsoft Azure Agrifood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agrifood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python311-azure-mgmt-agrifood-1.0.0b3-1.4.noarch.rpm"
RPM_HASH = "f656117cf82084d623d96ac82a0a36feabe3b7547ce76b495cf5cf58b1a42d0c08311c00a397999a7dfd4e0234c89f029f0acd2aa01112413397c2acd965b243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-agrifood \
python3.11dist-azure-mgmt-agrifood \
python311-azure-mgmt-agrifood \
python3dist-azure-mgmt-agrifood"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
