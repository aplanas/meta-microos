SUMMARY = "Necessary packages for plasma-vault to support cryfs vaults"
DESCRIPTION = "This package pulls in dependencies for the plasma-vault cryfs backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma-vault-backend-cryfs-5.27.6-2.1.noarch.rpm"
RPM_HASH = "b0230217859cbbf063001c28669aa8dfd7a10ad4e18306d41789708ff0af1b60732b435c04253c522aea626dca9a45ac9d6b9bb4e473b117634a57eed9f7172e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma-vault-backend \
plasma-vault-backend-cryfs"

RDEPENDS:${PN} += "cryfs \
plasma-vault"

inherit rpm
