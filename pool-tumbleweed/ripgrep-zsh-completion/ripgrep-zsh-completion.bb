SUMMARY = "ZSH Completion for ripgrep"
DESCRIPTION = "The official zsh completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-zsh-completion-13.0.0-5.3.noarch.rpm"
RPM_HASH = "781fa6d17ff31c824c0f8fb9e29bfbe3a7e925235285f73ab2c8ced2e29e14135886a356c947cd1778aefc24ce8de0009449a749aecdf21c2fc4399261131af1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
