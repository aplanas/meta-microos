SUMMARY = "ZSH completion for fzf"
DESCRIPTION = "zsh shell completions for fzf"
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "fzf-zsh-completion-0.41.0-1.1.noarch.rpm"
RPM_HASH = "fb20b3ca1bff80687dde936ee1010bd8408231dfc08bb650694496410525478d7461a3436cb3e3a22246dac554088f6ad2bedfc3503ee9771bb0eb1508dc4587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fzf-zsh-completion \
fzf-zsh-completion"

RDEPENDS:${PN} += "fzf \
zsh"

inherit rpm
