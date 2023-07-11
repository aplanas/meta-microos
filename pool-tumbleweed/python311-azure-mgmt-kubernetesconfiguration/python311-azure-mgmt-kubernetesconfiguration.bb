SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-kubernetesconfiguration-3.0.0-1.2.noarch.rpm"
RPM_HASH = "a2404602c0f38fe10c7fe81988dab36e6f3ef60e5a51d856281fef071211dac443dfa75075ae9380f6407f2c04c52783a5889716dc5526b62ee3877e1986958c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kubernetesconfiguration \
python3.11dist-azure-mgmt-kubernetesconfiguration \
python311-azure-mgmt-kubernetesconfiguration \
python3dist-azure-mgmt-kubernetesconfiguration"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
