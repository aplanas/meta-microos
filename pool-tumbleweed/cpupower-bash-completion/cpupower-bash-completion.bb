SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "cpupower-bash-completion-6.4.11-4.22.noarch.rpm"
RPM_HASH = "60d1915658494ad454ce1047ed723c32ced427c9a5c17af185569d661c55f34ad8251c4177139204c11eb4f2f07d68a646809986cb3440ad32b3d21ccc0168f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
