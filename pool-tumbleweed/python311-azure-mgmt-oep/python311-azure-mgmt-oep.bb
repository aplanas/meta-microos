SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-oep-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "a2abc1e7c89b9070c3e27a44da673c23cdd3f0d2b7d18991e27c5614d6c84adc42756c35b245343f796c25f5c01854542459898c56c429fe8fe34247aac15937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-oep \
python3.11dist-azure-mgmt-oep \
python311-azure-mgmt-oep \
python3dist-azure-mgmt-oep"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
