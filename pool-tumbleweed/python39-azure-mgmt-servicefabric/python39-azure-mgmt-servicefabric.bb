SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-servicefabric-2.0.0-1.8.noarch.rpm"
RPM_HASH = "f06eb22a40018f61013fee163310663aef049c8f89ee242e085951cd8a6da4b78abdceefc9f1c7c17f107941f909fad27d73b1af80806f8d2798afd0d24f8936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-servicefabric) \
python39-azure-mgmt-servicefabric \
python3dist(azure-mgmt-servicefabric)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
