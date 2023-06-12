SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-privatedns-1.1.0-1.1.noarch.rpm"
RPM_HASH = "1ec48e8c98ddf8e49b1df474a7ca8c80a43ff844035eafee166d0f66dcfb2d319a59f145e5bdee384a2c2a31efa523f4da08234099e1752002c2819b0faffe34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-privatedns) \
python39-azure-mgmt-privatedns \
python3dist(azure-mgmt-privatedns)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
