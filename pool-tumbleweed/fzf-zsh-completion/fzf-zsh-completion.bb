SUMMARY = "ZSH completion for fzf"
DESCRIPTION = "zsh shell completions for fzf"
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-zsh-completion-0.42.0-1.1.noarch.rpm"
RPM_HASH = "738c97b5933358b3d19bf6474857bc85b9a58d9f5f345d78850501ec9434ffbd3d1d0eb2d275478eab55086f831bd8714f4473c99bae770d7bd550e4930c93aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fzf-zsh-completion \
fzf-zsh-completion"

RDEPENDS:${PN} += "fzf \
zsh"

inherit rpm
