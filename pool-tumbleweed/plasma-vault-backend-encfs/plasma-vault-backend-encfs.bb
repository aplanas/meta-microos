SUMMARY = "Necessary packages for plasma-vault to support encfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault encfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma-vault-backend-encfs-5.27.6-2.1.noarch.rpm"
RPM_HASH = "7e41c1b49c371749e7f83d7c802e89b8f98595f923da7541921dc15f312bdd986037ac0de41acf376641f80741749c0e3a0978f5f36a262267f18da82f3fda9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma-vault-backend \
plasma-vault-backend-encfs"

RDEPENDS:${PN} += "encfs \
plasma-vault"

inherit rpm
