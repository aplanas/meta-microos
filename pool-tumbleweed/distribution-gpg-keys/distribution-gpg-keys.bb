SUMMARY = "GPG keys of various Linux distributions"
DESCRIPTION = "GPG keys used by various Linux distributions to sign packages."
LICENSE = "CC0-1.0"

PV = "1.79"

RPM_NAME = "distribution-gpg-keys-1.79-1.2.noarch.rpm"
RPM_HASH = "9ae2d3ea058441035a195415a9b9ae2c2734d9e378b5dea3dd40ffd0304a0db5c7a024893bc473ed8fece97f01156fe8ecca66ed7d0bb0c9ed13554bc29e7727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-gpg-keys"

RDEPENDS:${PN} += ""

inherit rpm
