SUMMARY = "ZSH completion for flameshot"
DESCRIPTION = "zsh shell completions for flameshot."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-zsh-completion-12.1.0-2.1.noarch.rpm"
RPM_HASH = "ac41b5b652cde7fcdbb11f3e451d46dfff792633f4b76210dbbe121a2e56eaeff9701e8850cf1ea2171a22527df84809e2a880a961fac6fdddaf740ef7f6dbad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-zsh-completion"
RDEPENDS:${PN} += "flameshot"

inherit rpm
