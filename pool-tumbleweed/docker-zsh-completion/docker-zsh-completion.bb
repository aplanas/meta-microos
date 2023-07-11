SUMMARY = "Zsh Completion for docker"
DESCRIPTION = "Zsh command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.2_ce"

RPM_NAME = "docker-zsh-completion-24.0.2_ce-2.1.noarch.rpm"
RPM_HASH = "c17ef8954055bca35ed42b2a7d31ed4a44a478ef271a02af7ebc2fc5e94dfe1e815b04b8873de1d6d4dfc98898a4d2c8a0583eb4fd9e36aedbfd3a47ec380406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-zsh-completion"

RDEPENDS:${PN} += "docker \
zsh"

inherit rpm
