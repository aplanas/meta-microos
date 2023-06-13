SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-securityinsight-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "e7fab08862c39a4c8b1341c917f36bb96f221d4738223272bc337bde9e2912ea67801f41bc675d622edd45c9d0083bbcc82c8e6c2a8488e5abb5286571840ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-securityinsight) \
python311-azure-mgmt-securityinsight \
python3dist(azure-mgmt-securityinsight)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
