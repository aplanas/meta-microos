SUMMARY = "ZSH completion for fzf"
DESCRIPTION = "zsh shell completions for fzf"
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-zsh-completion-0.42.0-1.2.noarch.rpm"
RPM_HASH = "10706867b359aaacaebe3e10bf2e43153e8668c21034d7c7c64541d006471abc4a29a313c2c5dc9d6aefc6e6338e33007b76d5e03e3b5446011f53727202f09c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fzf-zsh-completion \
fzf-zsh-completion"

RDEPENDS:${PN} += "fzf \
zsh"

inherit rpm
