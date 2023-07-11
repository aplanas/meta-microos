SUMMARY = "Bash completion for mmcli"
DESCRIPTION = "This package contain the bash completion command for nmcli tools."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.6"

RPM_NAME = "ModemManager-bash-completion-1.20.6-1.2.noarch.rpm"
RPM_HASH = "7181996ec142dd77b7d812498e189e19573b6582520533df7aedd1c61da62dec87579ec49dc40a92c33fb5db0fb1c75e465a89019b0a73d1ad86c763abecc992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ModemManager-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
