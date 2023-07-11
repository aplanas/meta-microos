SUMMARY = "Bash completion for gmic"
DESCRIPTION = "This package contains the bash completion command for gmic."
LICENSE = "CECILL-2.1"

PV = "3.2.6"

RPM_NAME = "gmic-bash-completion-3.2.6-1.1.noarch.rpm"
RPM_HASH = "f3138f7f712588638862e60130a8bdc4f51322020fc09240e4b297aabf95b2c78a8b321eff6323af9117507982481c03a6dc18c97f547b8fbbf32f993d7edeb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
