SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-messaging-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "bdf40bd73c0624678a165f1ed585986f1aad1a07140ac64f9f5573ff0951550f4307f608713e1713b26eb03bf2c6936bd21e3de44067af780677c26b922a77f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-messaging-nspkg \
python39-azure-messaging-nspkg \
python3dist-azure-messaging-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
