SUMMARY = "Zsh Completion for docker"
DESCRIPTION = "Zsh command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-zsh-completion-24.0.5_ce-1.1.noarch.rpm"
RPM_HASH = "4764267da9f32e749a5e7821c35735c6d1eec64a7b6135dd28f5002aa14e32aabc4f39104f7d7f5db0c378e8acda2a684e9a26ec78d7f34163bc64c1ba95199e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-zsh-completion"

RDEPENDS:${PN} += "docker \
zsh"

inherit rpm
