SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-securityinsight-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "95e68321bd9b6a463b2e7b8c1c26f2c65742e3f9cb6f498c2862308c763664662e889f002fe186658c9859c4aa72e5e86544620a7cf500a34566425d142f472e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-securityinsight \
python39-azure-mgmt-securityinsight \
python3dist-azure-mgmt-securityinsight"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
