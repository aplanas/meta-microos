SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-azure-mgmt-kubernetesconfiguration-3.0.0-1.1.noarch.rpm"
RPM_HASH = "b0f8e2e2911bffcd63732bf80cc45239bbea944a5f96431d9600fe1734f42453726370da8e02644e3cf65abede329b7f42f773b79753ff8cd3793c6b16314503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-kubernetesconfiguration) \
python39-azure-mgmt-kubernetesconfiguration \
python3dist(azure-mgmt-kubernetesconfiguration)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
