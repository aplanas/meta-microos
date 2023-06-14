SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python310-azure-mgmt-resourcehealth-1.0.0b4-1.1.noarch.rpm"
RPM_HASH = "4a52a7ee25c7897ee10dda7656f3d55e5a93c6bede08db60cd2b808144e004b57e96a36e722c12c6865740686f3c5fc0412872cc18f3051c6a1a663fcdbde581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcehealth \
python3.10dist-azure-mgmt-resourcehealth \
python310-azure-mgmt-resourcehealth \
python3dist-azure-mgmt-resourcehealth"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
