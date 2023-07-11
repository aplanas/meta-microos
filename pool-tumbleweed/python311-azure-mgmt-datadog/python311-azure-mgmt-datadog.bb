SUMMARY = "Microsoft Azure Datadog Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Datadog Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-datadog-2.0.0-1.9.noarch.rpm"
RPM_HASH = "ed5dc3d67085d8290fb8656bb81a981a16e28e405ed173b6589147c1f86fea65bb9925d44f8e091335d92aa30c8210abbdbc43e96feeb66e9ad1a63ef15137bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datadog \
python3.11dist-azure-mgmt-datadog \
python311-azure-mgmt-datadog \
python3dist-azure-mgmt-datadog"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
