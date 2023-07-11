SUMMARY = "Microsoft Azure EventGrid Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventGrid Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python39-azure-mgmt-eventgrid-10.2.0-1.5.noarch.rpm"
RPM_HASH = "eefb7359a82be16993ab82216d3e94878e2b1275350561d98be05f1a6f3edd28cf663ea4b0ed4da88250258a94cf41cb786aa4c891fb093544931cdff809f93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-eventgrid \
python39-azure-mgmt-eventgrid \
python3dist-azure-mgmt-eventgrid"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
