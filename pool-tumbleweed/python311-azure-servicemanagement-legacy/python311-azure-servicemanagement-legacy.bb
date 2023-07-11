SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.7"

RPM_NAME = "python311-azure-servicemanagement-legacy-0.20.7-2.12.noarch.rpm"
RPM_HASH = "3fd7ba9d40563bb32cab72e117bfdca62fbf8f29939a98cb95f54994c67e0bc8e7e75205b252fc5de725b2f6682c0e634e4ff3547c5dde6d1171141294d8b503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicemanagement-legacy \
python3.11dist-azure-servicemanagement-legacy \
python311-azure-servicemanagement-legacy \
python3dist-azure-servicemanagement-legacy"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-nspkg \
python311-requests"

inherit rpm
