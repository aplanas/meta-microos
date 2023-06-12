SUMMARY = "Microsoft Azure Communication Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Communication namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.communication namespace."
LICENSE = "MIT"

PV = "0.0.0b1"

RPM_NAME = "python39-azure-communication-nspkg-0.0.0b1-2.11.noarch.rpm"
RPM_HASH = "a4882190653a7f8bd5725b56920d1fb7e7006c1f19bae71dd1ddf6105662a720c709a4ab863e1047414026f1b40770441498bbf2d84e47dde2e0c3851c001202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-communication-nspkg) \
python39-azure-communication-nspkg \
python3dist(azure-communication-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm
