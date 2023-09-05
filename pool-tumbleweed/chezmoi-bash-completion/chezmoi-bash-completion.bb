SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.38.0"

RPM_NAME = "chezmoi-bash-completion-2.38.0-1.1.noarch.rpm"
RPM_HASH = "28f7d75f9f6bded8ecffa8dee5a2cf1e7e5a9ac2933e465bf823d971efb0240027dcf6e5994cce79cc85c88b32076fd6160d4e80cedab68c5d0c25ecb596b3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
