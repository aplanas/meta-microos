SUMMARY = "Copy passwords from a password store"
DESCRIPTION = "Copy passwords from a password store to the clipboard."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-vault-2.1.5-3.3.noarch.rpm"
RPM_HASH = "76b954353e437985a720ebebc1f1d9062662bdb2910f081db7606295aab8960576509457d46df48abc2843d33e0acc716f2f9c8bba85c3efecf4a509e19fdfe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-vault"
RDEPENDS:${PN} += "bumblebee-status \
password-store"

inherit rpm
