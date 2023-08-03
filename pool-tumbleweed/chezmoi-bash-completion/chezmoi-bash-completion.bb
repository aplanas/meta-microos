SUMMARY = "Bash completion for chezmoi"
DESCRIPTION = "Bash command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.36.1"

RPM_NAME = "chezmoi-bash-completion-2.36.1-1.1.noarch.rpm"
RPM_HASH = "bf360f9c3dd6ab30a2a539568eb13ee1c9919b35acd9b23c691c50b48f954ad6f7921f9fe5722c44845c9a4f4871a2ead8595b85878a073b4617bdc1eca05573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-bash-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
