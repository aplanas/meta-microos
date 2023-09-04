SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-avs-8.0.0-1.1.noarch.rpm"
RPM_HASH = "133397e744d3e8897e4b58bd2c4e367d43b4b2b1cec3eb59bfb63d4a7c25e0761df323727340e417854f180f9a4b9905ad4b0d64957fa34ae4c527697b912674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-avs \
python39-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
