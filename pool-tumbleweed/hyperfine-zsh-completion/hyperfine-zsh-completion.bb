SUMMARY = "ZSH Completion for hyperfine"
DESCRIPTION = "The official zsh completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.17.0"

RPM_NAME = "hyperfine-zsh-completion-1.17.0-1.1.noarch.rpm"
RPM_HASH = "0082456a0e564acddd4b67b97f327e9d06c1460b2b9c648bd7c560264f2bc2ea43578c47e7bb164b1e1abf4beade9daa55fbc2e20e64520b5fa37b85079d3d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
