SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-securityinsight-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "a745183f0c4d444319e305987cbb8e3c39fbd3c275a3e76acbba317ca9a5fcfdc5edae76df33b9103642a54f1b68fb1e8c824b5700f79ea9e61ce9edcf4bc800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-securityinsight \
python3.11dist-azure-mgmt-securityinsight \
python311-azure-mgmt-securityinsight \
python3dist-azure-mgmt-securityinsight"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
