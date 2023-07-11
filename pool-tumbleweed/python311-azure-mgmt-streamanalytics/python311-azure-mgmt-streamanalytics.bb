SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-streamanalytics-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "54b0c25cdef8c90fa1c72ce0dde5d3192ad68193b09be7d445b2935a77d24c51e41eef511ea294f204c7bd7f451d3ab961b1ec0e4a3adf5284a337e9f3ad3574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-streamanalytics \
python3.11dist-azure-mgmt-streamanalytics \
python311-azure-mgmt-streamanalytics \
python3dist-azure-mgmt-streamanalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
