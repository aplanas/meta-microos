SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-communication-2.0.0-1.2.noarch.rpm"
RPM_HASH = "8053b5273fda4178bb7489a3ee87a17f755ee1e83b6f77ff3cb14c742ed9ec179cbe123529e367d80aa3e7ea9afdbbae1a1993db6789f0b6662654438ea81141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-communication \
python39-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
