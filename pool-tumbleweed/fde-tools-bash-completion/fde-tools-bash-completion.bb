SUMMARY = "Bash completion for fde-tools"
DESCRIPTION = "Bash shell completions for fde-tools"
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "fde-tools-bash-completion-0.6.5-3.1.noarch.rpm"
RPM_HASH = "ad1f771c551ed026cb60b2054bb133b49f107177d8a62e9fa597f3955402d43255cbe41a3b2a88c124ad5b19851885eec0af48f117225b5e37914679804566ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fde-tools"

inherit rpm
