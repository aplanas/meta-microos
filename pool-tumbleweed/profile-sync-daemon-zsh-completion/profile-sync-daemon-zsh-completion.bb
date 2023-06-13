SUMMARY = "zsh completion for profile-sync-daemon"
DESCRIPTION = "zsh completion for profile-sync-daemon."
LICENSE = "MIT"

PV = "6.48"

RPM_NAME = "profile-sync-daemon-zsh-completion-6.48-1.2.noarch.rpm"
RPM_HASH = "ce975ed380503e12f6dae4623e086e4e3559be1ea42833b2190598e796d67de279b697952a67c2354e0c460c6ce6e1baf5d6ffb33baac84faf29822b9f2715c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "profile-sync-daemon-zsh-completion"

RDEPENDS:${PN} += "profile-sync-daemon"

inherit rpm
