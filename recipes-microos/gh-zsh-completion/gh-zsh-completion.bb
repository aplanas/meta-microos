SUMMARY = "ZSH Completion for gh"
DESCRIPTION = "ZSH command line completion support for gh."
LICENSE = "MIT"

PV = "2.30.0"

RPM_NAME = "gh-zsh-completion-2.30.0-1.1.noarch.rpm"
RPM_HASH = "8e09a488b615b09faaa26fafb6fc23d8166a69a0601d40d3879ec22fa74378cd860b6ee877b6dbc38601c974061918ef39f498b4ff62d3b6139edb2b732a4561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-zsh-completion"
RDEPENDS:${PN} += "gh"

inherit rpm
