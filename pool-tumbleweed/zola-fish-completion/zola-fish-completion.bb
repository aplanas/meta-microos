SUMMARY = "Fish Completion for zola"
DESCRIPTION = "Fish command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-fish-completion-0.17.2-2.2.noarch.rpm"
RPM_HASH = "473164c212b178d50ab0dd0c68183209122c84e74dcbc42ccf3ee5ecac4c57876c5a3e687eaee3b9a02afa1df3f6b9c4110b0080a4dd1696de45f1974bb160d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
