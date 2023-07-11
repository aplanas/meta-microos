SUMMARY = "Microsoft Azure Communication Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Communication Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-communication-2.0.0-1.2.noarch.rpm"
RPM_HASH = "37c776064827b0687333d135a846c0665b3d5fc1ea311a5c841aa73d37794707725d1a76fe2edf6732d42c777667ed4652aefc93af1144ee9910c2267516fb96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-communication \
python3.11dist-azure-mgmt-communication \
python311-azure-mgmt-communication \
python3dist-azure-mgmt-communication"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
