SUMMARY = "Zsh Completion for timoni"
DESCRIPTION = "zsh command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.11.1"

RPM_NAME = "timoni-zsh-completion-0.11.1-1.1.noarch.rpm"
RPM_HASH = "9b822fe22bb951452d4de1b13f2c4579b9cfa1e2e27f83a53e05c644c1236f89ead7d681e85fa4ead273724750b7b5bdbfd41ac61ca7f90d6165364ef17e5dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-zsh-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm
