SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "cpupower-bash-completion-6.3.4-4.12.noarch.rpm"
RPM_HASH = "35c939c2a423a8ae81bae528aa4a85096229656c28aa298e6470b9fa883bd68ee305b16633869ef0456baecaad7b7814e428bd34f5348a2ed581de0290620ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
