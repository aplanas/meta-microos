SUMMARY = "Zsh Completion for zellij"
DESCRIPTION = "Zsh command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.37.2"

RPM_NAME = "zellij-zsh-completion-0.37.2-1.1.noarch.rpm"
RPM_HASH = "351ad17f60345e3342aa83fc18c0e2b4d51a4133469c19cde9b3a1a8c5e3cdb6faf7a9118ab6ed9921a435048ddfa3d3c597660aa54c1a36df2c5ba22c653ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
