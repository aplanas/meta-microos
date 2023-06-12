SUMMARY = "Zsh Completion for docker"
DESCRIPTION = "Zsh command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "23.0.6_ce"

RPM_NAME = "docker-zsh-completion-23.0.6_ce-1.1.noarch.rpm"
RPM_HASH = "0033befa31eb31cd63b516c8d00e16b712ce2c1e4e444a3612952083774dba396eb0df0c1d51e7b3f56beaa2f138a77f90ec86d88425820daf458ed2a8654fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-zsh-completion"
RDEPENDS:${PN} += "docker \
zsh"

inherit rpm
