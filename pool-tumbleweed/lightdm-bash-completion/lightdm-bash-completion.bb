SUMMARY = "Bash completion for lightdm"
DESCRIPTION = "bash command line completion support for lightdm."
LICENSE = "GPL-3.0-or-later"

PV = "1.32.0"

RPM_NAME = "lightdm-bash-completion-1.32.0-2.3.noarch.rpm"
RPM_HASH = "76b90afaa3a89c3f820ffea2d43d62fbc11380cc325b23d7f2cf6308402ed907dfc5e0eeb76e120722bc4d5328a51b7dc71aa1e583b8238fb57b5f287d7a5339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
lightdm"

inherit rpm
