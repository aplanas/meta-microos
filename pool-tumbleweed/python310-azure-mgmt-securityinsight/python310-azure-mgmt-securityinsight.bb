SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-securityinsight-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "af2038eeaca3ebe071af71c79a293a625f88e8ae519ce79dbddf9814000838df35ffe08439c658c04b21d3b79bb9edd861f9d857226ff8690c43cb18e3963451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-securityinsight \
python310-azure-mgmt-securityinsight \
python3dist-azure-mgmt-securityinsight"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
