SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-communication-2.0.0-1.1.noarch.rpm"
RPM_HASH = "db25a6c7e51563ae2da3faaabb78b86f9d89da5326d93f894f09041f8b640d14baedd35befb0ec69e2ba3b30fa0e2c9945ee63c7edbde75f42b5b699765d320f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-communication \
python311-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
