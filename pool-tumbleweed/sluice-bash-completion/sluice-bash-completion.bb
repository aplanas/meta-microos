SUMMARY = "Bash Completion for sluice"
DESCRIPTION = "Bash completion script for sluice."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.13"

RPM_NAME = "sluice-bash-completion-0.02.13-1.9.noarch.rpm"
RPM_HASH = "067485c78ece445c8a3ba551d2feb1e21e87d0d3f30a29c1ca222765eff80fb70c306895875a3b8a9ab2730446d9e9dd6ab1c522b42261cbeac8f634e6c94ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sluice-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sluice"

inherit rpm
