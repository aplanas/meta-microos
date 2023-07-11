SUMMARY = "ZSH Completion for gh"
DESCRIPTION = "ZSH command line completion support for gh."
LICENSE = "MIT"

PV = "2.31.0"

RPM_NAME = "gh-zsh-completion-2.31.0-1.1.noarch.rpm"
RPM_HASH = "f81b88568315beeb4b6a3121bf5c79835ee5df5af01a3f1a261729b00d8967e6fe6d801a38bf687366cea344abed1ff69d3596372e35aaeb36a7972a23b1e2c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-zsh-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
