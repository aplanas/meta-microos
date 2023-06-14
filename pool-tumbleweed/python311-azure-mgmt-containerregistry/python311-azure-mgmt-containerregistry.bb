SUMMARY = "Microsoft Azure Container Registry Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python311-azure-mgmt-containerregistry-10.1.0-1.2.noarch.rpm"
RPM_HASH = "c49b2ff955fde43bb211e66e33bcf6d196535228b26742f64d33ea4819a4ed8c696b094b0dcbf89f16908c5b52bdcf186290261fb226de4b0311ebf47169863d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-containerregistry \
python311-azure-mgmt-containerregistry \
python3dist-azure-mgmt-containerregistry"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
