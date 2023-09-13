SUMMARY = "Zsh Completion for docker"
DESCRIPTION = "Zsh command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-zsh-completion-24.0.5_ce-2.1.noarch.rpm"
RPM_HASH = "c47b85fed28b9742a00cf93d4428f3258051be3d0767a45b9bed2eace045ca97f3c098884af421c16f9e31d1389ba5189831c134a0e7803877a6911a206646c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-zsh-completion"

RDEPENDS:${PN} += "docker \
zsh"

inherit rpm
