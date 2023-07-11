SUMMARY = "ZSH Completion for ripgrep"
DESCRIPTION = "The official zsh completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-zsh-completion-13.0.0-5.4.noarch.rpm"
RPM_HASH = "2aea7f686df3240bc331b2f452f9a5b6aea02d3c2b6488a4f5ccb50a4d5dc427b0cb73f538c8e4ccc2f13b379af9fb1689fd2d85c5f6085d54e188257e23673c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
