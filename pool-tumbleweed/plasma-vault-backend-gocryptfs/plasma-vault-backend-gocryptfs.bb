SUMMARY = "Necessary packages for plasma-vault to support gocryptfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault gocryptfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma-vault-backend-gocryptfs-5.27.6-2.1.noarch.rpm"
RPM_HASH = "65cc648a3b5eb497cb1fc696da3f085def99637b17907c1c09b82d924b74c6fbccb94d67d0a286f64e112a8e1b6a840f7d522b566bb63609398577446bf72f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma-vault-backend \
plasma-vault-backend-gocryptfs"

RDEPENDS:${PN} += "gocryptfs \
plasma-vault"

inherit rpm
