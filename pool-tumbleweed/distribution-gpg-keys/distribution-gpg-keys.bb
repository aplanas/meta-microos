SUMMARY = "GPG keys of various Linux distributions"
DESCRIPTION = "GPG keys used by various Linux distributions to sign packages."
LICENSE = "CC0-1.0"

PV = "1.88"

RPM_NAME = "distribution-gpg-keys-1.88-1.1.noarch.rpm"
RPM_HASH = "aff142f281720986631689b67ca9cca0a999f65bbc6cb766f3b1ef6b2011fc6ad7acb8147c66af799907e249556e365ef57608160f55e962e79b8b94c0d53757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-gpg-keys"

RDEPENDS:${PN} += ""

inherit rpm
