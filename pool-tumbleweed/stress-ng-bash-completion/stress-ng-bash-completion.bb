SUMMARY = "Bash Completion for stress-ng"
DESCRIPTION = "Bash completion script for stress-ng."
LICENSE = "GPL-2.0-only"

PV = "0.15.06"

RPM_NAME = "stress-ng-bash-completion-0.15.06-1.3.noarch.rpm"
RPM_HASH = "79d3a6d25dfaf2d9aa7f6a4bf406d97e1a15b9fd73ff0434ec8419981282f8de2d4ab975f18f2a5105f0f51e7382965fe69189e3217fab69dd21b2c92e80f70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stress-ng-bash-completion"

RDEPENDS:${PN} += "bash-completion \
stress-ng"

inherit rpm
