SUMMARY = "Zsh Completion for yq"
DESCRIPTION = "Zsh command line completion support for yq."
LICENSE = "MIT"

PV = "4.34.2"

RPM_NAME = "yq-zsh-completion-4.34.2-1.1.noarch.rpm"
RPM_HASH = "80b738aa8aee02aebf7374e7445f0cf777757fe0619e51ec4b9be1b3efbbd73f940863366cb86d02499b3777a524dc626649f57bc7c39875dc24d2a0798826f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-zsh-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
