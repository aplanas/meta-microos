SUMMARY = "Zsh Completion for restic"
DESCRIPTION = "Zsh command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-zsh-completion-0.15.2-1.3.noarch.rpm"
RPM_HASH = "9352e2165749e50b0313fcb1261b6083cfe06fa76bc546e2580cbb9594c1e962f47bcde7d1f80a4e5cf0b42cb9bb1d9cfb24c2b8df9bb1dc178954ca823dec57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-restic-zsh-completion \
restic-zsh-completion"

RDEPENDS:${PN} += "restic"

inherit rpm
