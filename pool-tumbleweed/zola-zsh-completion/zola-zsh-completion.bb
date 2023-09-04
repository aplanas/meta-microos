SUMMARY = "Zsh Completion for zola"
DESCRIPTION = "Zsh command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-zsh-completion-0.17.2-3.1.noarch.rpm"
RPM_HASH = "33c57ceeecf4eac42a8c02622cda3e01a1dc3b7765705785cdf6021ee6eb3a5b8b62a676610e1770315634c116080fd919329bf9de7b3c3a78068d5b9734912a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
