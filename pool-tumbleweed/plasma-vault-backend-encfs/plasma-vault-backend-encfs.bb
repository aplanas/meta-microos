SUMMARY = "Necessary packages for plasma-vault to support encfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault encfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma-vault-backend-encfs-5.27.7-1.1.noarch.rpm"
RPM_HASH = "bb093c97e6f6c6432329a8de28d36c3750604d3210570c5bd577c94d0dea1daf9f41086b07e6e0899c57f85f229c52a8b59162651b216b5af910c55d13fdce1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma-vault-backend \
plasma-vault-backend-encfs"

RDEPENDS:${PN} += "encfs \
plasma-vault"

inherit rpm
