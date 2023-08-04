SUMMARY = "Necessary packages for plasma-vault to support cryfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault cryfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma-vault-backend-cryfs-5.27.7-1.1.noarch.rpm"
RPM_HASH = "34305803a8e9d2e9fa9e16ac14df199c35db2f5d04eb0d1930460bb82a8ee9a6870fcc28d5de221b6b9f83c028c14a8280703980258428bdf706681d19c1420f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma-vault-backend \
plasma-vault-backend-cryfs"

RDEPENDS:${PN} += "cryfs \
plasma-vault"

inherit rpm
