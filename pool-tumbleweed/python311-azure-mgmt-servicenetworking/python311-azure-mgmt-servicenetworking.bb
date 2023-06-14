SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python311-azure-mgmt-servicenetworking-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "c0b5f485b6dca0ec5f9e25c2fdce35204fe7a28c437e2e3d60b812c7843858a6d8490c0d2abf6ad74f0e2329386d7aa766c66146ab487af51e1be6f38a75543b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-servicenetworking \
python311-azure-mgmt-servicenetworking \
python3dist-azure-mgmt-servicenetworking"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
