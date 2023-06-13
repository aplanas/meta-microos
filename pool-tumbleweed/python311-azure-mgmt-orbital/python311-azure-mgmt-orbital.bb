SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-orbital-2.0.0-1.2.noarch.rpm"
RPM_HASH = "eaaa380b14e5595fc8488d20a6f34a68a56ff8135b620e3e9ae2cbdb8a41cb3d7c8fc0416c5fc4a5c4396cc5c5405e0130775ef899890f980ec47d6e32c577d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-orbital) \
python311-azure-mgmt-orbital \
python3dist(azure-mgmt-orbital)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
