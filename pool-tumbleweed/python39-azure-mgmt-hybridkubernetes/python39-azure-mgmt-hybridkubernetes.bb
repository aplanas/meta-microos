SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-hybridkubernetes-1.1.0-1.9.noarch.rpm"
RPM_HASH = "aa6507d04d4efb2f116c66c6628456a82f53535f693b8088ea6556b9b9ad2eb1c120b0943c8bae515e8333d1339415976e2bd28bf11830a4d8951fb313320e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-hybridkubernetes \
python39-azure-mgmt-hybridkubernetes \
python3dist-azure-mgmt-hybridkubernetes"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
