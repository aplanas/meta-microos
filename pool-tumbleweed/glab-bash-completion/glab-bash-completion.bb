SUMMARY = "Bash completion for glab"
DESCRIPTION = "Bash command line completion support for glab."
LICENSE = "MIT"

PV = "1.32.0"

RPM_NAME = "glab-bash-completion-1.32.0-1.1.noarch.rpm"
RPM_HASH = "af48db90c755b6a707dce150f840ce1673e436e82a89e16110ac320a4171b9fcb109547c004818b68866fba9fd12e587428e15395eac4b39ce8a4f8b4028986d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-bash-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
