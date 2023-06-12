SUMMARY = "MS Azure Recoveryservicessiterecovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicessiterecovery Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-recoveryservicessiterecovery-1.0.0.0-2.2.noarch.rpm"
RPM_HASH = "9d9fe87afcbb4fc913a803cfd46a074f2310b1bd2d99fdcf41e61455075892dd3e29418f64f26c74dfb841105ddf480e2f14415681d5ef79c9398f9c08c31698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-recoveryservicessiterecovery) \
python311-azure-mgmt-recoveryservicessiterecovery \
python3dist(azure-mgmt-recoveryservicessiterecovery)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
