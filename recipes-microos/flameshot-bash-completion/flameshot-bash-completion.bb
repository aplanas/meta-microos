SUMMARY = "Bash Completion for flameshot"
DESCRIPTION = "Bash completion script for flameshot's CLI."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-bash-completion-12.1.0-1.4.noarch.rpm"
RPM_HASH = "dd0ae6a3276941909a5e167f81add5a25156db7becf47450c857763bdc56cb7bb17ae74b1650f6de065f6ab173e83c175db3852871d0b595692900947242dda6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-bash-completion"
RDEPENDS:${PN} += "bash-completion flameshot"

inherit rpm
