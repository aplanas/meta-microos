SUMMARY = "Bash completion for mmcli"
DESCRIPTION = "This package contain the bash completion command for nmcli tools."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-bash-completion-1.20.6-1.1.noarch.rpm"
RPM_HASH = "25c0b18a10cd06c11de5804ca079b270b31b6f85d136435b0b50fff9e119605568cc2192f8d3672287f9958a5201b5365b2b03937bfdfc50b9596b1d4638d45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ModemManager-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
