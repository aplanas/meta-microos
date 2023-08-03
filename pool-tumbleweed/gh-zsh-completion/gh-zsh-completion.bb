SUMMARY = "ZSH Completion for gh"
DESCRIPTION = "ZSH command line completion support for gh."
LICENSE = "MIT"

PV = "2.32.1"

RPM_NAME = "gh-zsh-completion-2.32.1-1.1.noarch.rpm"
RPM_HASH = "d2f7b7fcbb505af47973f1e96e5dac2fba920a2c6e360fdbaea0acfe03fc1e5213ceb581d6bc4309af415ab1ec7be9001c3bae72164a81e481098ea41fa6c1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-zsh-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
