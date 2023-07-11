SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python310-azure-mgmt-netapp-10.0.0-1.2.noarch.rpm"
RPM_HASH = "2a17d1f8db21e5478aac419826fb60931cec1e806f7bffb63fb60ad56a31fff97407b74ce13f0a6ca35f2492eb3f583afc0bf1304527c8f80c955d930e2e6e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-netapp \
python310-azure-mgmt-netapp \
python3dist-azure-mgmt-netapp"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
