SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.4"

RPM_NAME = "pluto-zsh-completion-5.18.4-1.1.noarch.rpm"
RPM_HASH = "e814ac647a6f4ca7cc5180af43c9b5fb368b12c134e78755daa265305bc4a0561e4ff289d80dea70ce7297de67a14a01e268da0a64341d1a5b907cac1c6061f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
