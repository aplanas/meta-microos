SUMMARY = "Bash completion for android-tools"
DESCRIPTION = "Bash command line completion support for android-tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.4"

RPM_NAME = "android-tools-bash-completion-34.0.4-1.2.noarch.rpm"
RPM_HASH = "ec51bafd1fa7306f26d6d879be5e707449c977a56fba2bf5a366a6472f3e9e690bd3397eb506599ee341e1be0b92fc96be2a772feb5c7d1a014e15770e994b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
