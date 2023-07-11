SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-azure-mgmt-kubernetesconfiguration-3.0.0-1.2.noarch.rpm"
RPM_HASH = "91ed514714726e280cd9f7d608f1594df1178cc5440d7ed934448c4fee152ec44d397ed9c47f76d7f613cd48449f3bdaf6ae9209ea16d782c7e5c48581c3636c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-kubernetesconfiguration \
python310-azure-mgmt-kubernetesconfiguration \
python3dist-azure-mgmt-kubernetesconfiguration"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
