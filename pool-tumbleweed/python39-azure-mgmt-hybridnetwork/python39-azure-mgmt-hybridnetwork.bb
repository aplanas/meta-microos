SUMMARY = "Microsoft Azure Hybridnetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridnetwork Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-hybridnetwork-1.0.0-1.9.noarch.rpm"
RPM_HASH = "201975287ea294c4104ded293af0b7ddc8ca90387e0252b1c648ec4d488974216e3146b3845539588dadedfc25f2bf8b9b42f1dc4f806faab8a229f5d22475f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-hybridnetwork \
python39-azure-mgmt-hybridnetwork \
python3dist-azure-mgmt-hybridnetwork"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
