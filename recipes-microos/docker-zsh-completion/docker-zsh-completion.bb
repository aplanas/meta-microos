SUMMARY = "Zsh Completion for docker"
DESCRIPTION = "Zsh command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "23.0.5_ce"

RPM_NAME = "docker-zsh-completion-23.0.5_ce-1.1.noarch.rpm"
RPM_HASH = "c7b48e0e89697bed8fb1e733ea953aea5e020792399bec3944dc5634855e4bb5050234b390d541966e7843a9d6deb8cca313a51d8bab625e24564ee8662c3388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-zsh-completion"
RDEPENDS:${PN} += "docker zsh"

inherit rpm
