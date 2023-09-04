SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-avs-8.0.0-1.1.noarch.rpm"
RPM_HASH = "9a6d6c248fd920f2406330dae77190a999fee2c502e0de9ae7c1eaec2704207a939e8e9fcb312b1306817c9a8c5c95b20d1322c64f4944d87b42e51d00d55adb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-avs \
python3.11dist-azure-mgmt-avs \
python311-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
