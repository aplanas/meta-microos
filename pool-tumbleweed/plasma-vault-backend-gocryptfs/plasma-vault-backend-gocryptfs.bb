SUMMARY = "Necessary packages for plasma-vault to support gocryptfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault gocryptfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma-vault-backend-gocryptfs-5.27.7-1.1.noarch.rpm"
RPM_HASH = "ab84a94804d31bc2c916bb419db213bdf5318bcc78c50bad1e338dc48398dc5c3f50ad71a56e064e2713f5e9350ccdd8cc1790b1836b88879cc9a03a9f6c80d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma-vault-backend \
plasma-vault-backend-gocryptfs"

RDEPENDS:${PN} += "gocryptfs \
plasma-vault"

inherit rpm
