SUMMARY = "Zsh Completion for zellij"
DESCRIPTION = "Zsh command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.36.0"

RPM_NAME = "zellij-zsh-completion-0.36.0-1.1.noarch.rpm"
RPM_HASH = "9219a524b52cd78a9711758cc081d6e203ede304dfa05f4fb0b81d4ec1a688959837af0348abec451907ae34f5b0c65fb73e399719d9975b6ad5c07205283124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
