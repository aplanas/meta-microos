SUMMARY = "Microsoft Azure Service Management Legacy Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Management Legacy Client Library. \
 \
All packages in this bundle have been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "Apache-2.0"

PV = "0.20.7"

RPM_NAME = "python310-azure-servicemanagement-legacy-0.20.7-2.11.noarch.rpm"
RPM_HASH = "607b358bee568f69b1f87be8e7922cb73016e426fc9562035a60aac66eafd6eed32199adcdd0420c53a34896b2fbf01f107e54ee57122a19393f2abe7352af6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-servicemanagement-legacy \
python3.10dist(azure-servicemanagement-legacy) \
python310-azure-servicemanagement-legacy \
python3dist(azure-servicemanagement-legacy)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-nspkg \
python310-requests"

inherit rpm
