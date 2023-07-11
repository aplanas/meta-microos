SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-appcontainers-2.0.0-1.3.noarch.rpm"
RPM_HASH = "ede76ec592afdb6d2a40bde21ac1090d628d255b5d86cd47648d67caf90c1772af0b7eb9bb4b1c94e87287f3bd8fbaee0d7e41a6ec6a20acd53a0262067af93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appcontainers \
python3.11dist-azure-mgmt-appcontainers \
python311-azure-mgmt-appcontainers \
python3dist-azure-mgmt-appcontainers"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
