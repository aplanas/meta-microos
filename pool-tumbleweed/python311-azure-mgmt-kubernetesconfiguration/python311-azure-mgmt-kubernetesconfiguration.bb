SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-kubernetesconfiguration-3.0.0-1.1.noarch.rpm"
RPM_HASH = "662332876853b6e9cc38d2e59f44e76f86a270ec5066487d214a6599e591be7311eeb1304763fbff32fa7cc9227dd59cbeea4dc452aee332aba16650a3c76948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-kubernetesconfiguration \
python311-azure-mgmt-kubernetesconfiguration \
python3dist-azure-mgmt-kubernetesconfiguration"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
