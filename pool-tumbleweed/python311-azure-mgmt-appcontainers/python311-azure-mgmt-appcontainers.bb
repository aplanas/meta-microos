SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-appcontainers-2.0.0-1.2.noarch.rpm"
RPM_HASH = "38ce8c84f3d817d4ca0ac6cb0a428d30bc568bbb3034b6d12a0e6ef4e3eff6e8f7bd9b9cfa3682a3278fea0a4fabd6fb7e49b0a9a92e3b0d1200079da60671b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-appcontainers \
python311-azure-mgmt-appcontainers \
python3dist-azure-mgmt-appcontainers"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
