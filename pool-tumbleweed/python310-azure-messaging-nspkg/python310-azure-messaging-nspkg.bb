SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-messaging-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "dd629f8214b5255487825a6ede4ab573716675d177ed7c413c91a866d1863e89902b26a5d2c225b29c6538edc388b4867d4feefc21d39891f7dbcec47b731cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-messaging-nspkg \
python310-azure-messaging-nspkg \
python3dist-azure-messaging-nspkg"

RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
