SUMMARY = "ZSH completion for pdfgrep"
DESCRIPTION = "zsh shell completions for pdfgrep."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "pdfgrep-zsh-completion-2.1.2-2.10.noarch.rpm"
RPM_HASH = "7243f03d47bdc41802e77e496776864d6a0dcd6e8083655e329e4217e4d305fb16980e6610166639aa1abc293e0ff85263627d62b3b4ff8818853a3016b32599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfgrep-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
