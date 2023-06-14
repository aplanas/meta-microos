SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-messaging-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "94e0da9a676721afc33419e4f24e893f412d2848b00a3909aa20ae4193c0a5e052b47d8c561204edda093ba2dc037c37f6858a5fbf079eebe2b121d5f239da85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-messaging-nspkg \
python39-azure-messaging-nspkg \
python3dist-azure-messaging-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
