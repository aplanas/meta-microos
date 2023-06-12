SUMMARY = "Bash completion for rbenv"
DESCRIPTION = "The official bash completion script for rbenv."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "rbenv-bash-completion-1.2.0-1.4.noarch.rpm"
RPM_HASH = "45678f5a6cddb5a97ce98b65280532d94952a99dfc06ce77dc428d889bd83c404720240c01e5466193a8035bffa1efe3dc83875a06de1e47a7f1528ac4552a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
