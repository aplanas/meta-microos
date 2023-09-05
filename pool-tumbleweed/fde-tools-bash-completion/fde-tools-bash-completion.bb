SUMMARY = "Bash completion for fde-tools"
DESCRIPTION = "Bash shell completions for fde-tools"
LICENSE = "GPL-2.0-only"

PV = "0.6.9"

RPM_NAME = "fde-tools-bash-completion-0.6.9-1.1.noarch.rpm"
RPM_HASH = "5bef9f422749de53f27a14b309835aae279d0b42c40f9307d612ffadceba5182eb2cb40c584456d89e69b66c44814ad0057f56511ad06e704a84fd6a4e56dbfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fde-tools"

inherit rpm
