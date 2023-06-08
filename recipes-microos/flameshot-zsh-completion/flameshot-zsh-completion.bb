SUMMARY = "ZSH completion for flameshot"
DESCRIPTION = "zsh shell completions for flameshot."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-zsh-completion-12.1.0-1.4.noarch.rpm"
RPM_HASH = "6b033f9b36781a9584d6d2bc8e9920b01813aee961a5e7426a466375899ed5195cf43188b66930e50639fafb0ab19340824a5e83e4fef3e47720e2ebe534ba9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-zsh-completion"
RDEPENDS:${PN} += "flameshot"

inherit rpm
