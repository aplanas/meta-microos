SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python39-azure-mgmt-cdn-12.0.0-1.7.noarch.rpm"
RPM_HASH = "5a37e8b7d454487fdf9eb475513eebca45ca1ae922a0b6f36dd09ef5adc6cac52880336703d51b15cad5839dfd714fefb9ca9382e2f66dc79dd1f68f784883af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-cdn \
python39-azure-mgmt-cdn \
python3dist-azure-mgmt-cdn"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
