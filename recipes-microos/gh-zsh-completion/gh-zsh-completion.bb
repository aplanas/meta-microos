SUMMARY = "ZSH Completion for gh"
DESCRIPTION = "ZSH command line completion support for gh."
LICENSE = "MIT"

PV = "2.28.0"

RPM_NAME = "gh-zsh-completion-2.28.0-1.1.noarch.rpm"
RPM_HASH = "66cf5a7c1405d956ecbbde35942fe4fec728d21ffb1678098541e14f6c7d6c8de49e91a4910d20d21c48bc5b58c38b6e7592e55695cc96c66b9bf2cac0dcb0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-zsh-completion"
RDEPENDS:${PN} += "gh"

inherit rpm
