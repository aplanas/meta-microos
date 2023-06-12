SUMMARY = "Bash completion for lightdm"
DESCRIPTION = "bash command line completion support for lightdm."
LICENSE = "GPL-3.0-or-later"

PV = "1.32.0"

RPM_NAME = "lightdm-bash-completion-1.32.0-2.2.noarch.rpm"
RPM_HASH = "6248fc6adbce1e69eb324f49e6ab9eb8f42ffda611fb1cc29c17b0a63bbbe378fd7f9899470cdd2c552c82c96bd645d6403bd5cacf9a642ccb091e0c306675b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-bash-completion"
RDEPENDS:${PN} += "bash-completion \
lightdm"

inherit rpm
