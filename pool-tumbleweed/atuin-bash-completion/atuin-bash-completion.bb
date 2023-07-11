SUMMARY = "Bash completion for atuin"
DESCRIPTION = "Bash command line completion support for atuin."
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "atuin-bash-completion-15.0.0-1.1.noarch.rpm"
RPM_HASH = "ca38b6e1431c3e1471f5b8413ed8b2564084ef6a7d18c677e62f423c38be6d41fc8b2e50a764f78adcbdb368a6f54ab0c6b0c268ae1098351839bf5cc61ccaa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-bash-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
