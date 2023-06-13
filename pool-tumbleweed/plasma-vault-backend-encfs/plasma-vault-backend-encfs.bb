SUMMARY = "Necessary packages for plasma-vault to support encfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault encfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma-vault-backend-encfs-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "482e4be3f549cb2d0c882cece575e9bd5505d7b1ae6bc38f887fc8b3e84cb35d2fde92f7a2a0f3ef55dbc49a9e0d5707aeb85c8834ff3eb8a9205b701b7ac125"

RPROVIDES:${PN} += "plasma-vault-backend \
plasma-vault-backend-encfs \
plasma-vault-backend-encfs(aarch-64)"

RDEPENDS:${PN} += "encfs \
plasma-vault"

inherit rpm
