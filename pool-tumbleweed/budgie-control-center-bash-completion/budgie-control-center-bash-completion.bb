SUMMARY = "Bash Completion for Budgie Control Center"
DESCRIPTION = "This package contains the Bash Completion for Budgie Control Center"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0+0"

RPM_NAME = "budgie-control-center-bash-completion-1.2.0+0-1.4.aarch64.rpm"
RPM_HASH = "2a964710c315f9a527577101d598c2a1435db803832269057a02970785beab2075f1e09ea0b840bf2697094ee5e9b4e2407e54e8f1488eeb7ae74b2dc28cc260"

RPROVIDES:${PN} += "budgie-control-center-bash-completion"

RDEPENDS:${PN} += "bash-completion \
budgie-control-center"

inherit rpm
