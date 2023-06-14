SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-kubernetesconfiguration-3.0.0-1.1.noarch.rpm"
RPM_HASH = "6931b9e15e7432a783c6130c2faa5bcd19bf3bfaa1fa08b710191d0df7fb537a3062f6c1f7881ef5ec2ab36341f202b9956090e921086daa094d7f8e0a89d964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kubernetesconfiguration \
python3.10dist-azure-mgmt-kubernetesconfiguration \
python310-azure-mgmt-kubernetesconfiguration \
python3dist-azure-mgmt-kubernetesconfiguration"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
