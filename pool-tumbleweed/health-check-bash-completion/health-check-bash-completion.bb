SUMMARY = "Bash Completion for health-check"
DESCRIPTION = "Bash completion script for health-check."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.09"

RPM_NAME = "health-check-bash-completion-0.03.09-1.12.noarch.rpm"
RPM_HASH = "64d730e06f15f24a352c23681a2bb52869cd2543b548e24be3ce37f98422d002e490dd93a9acc02f8214aa7a418377ca8a349dbdb43e175a3c46b953caed925c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-check-bash-completion"

RDEPENDS:${PN} += "bash-completion \
health-check"

inherit rpm
