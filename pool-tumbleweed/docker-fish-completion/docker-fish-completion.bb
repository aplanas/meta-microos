SUMMARY = "Fish completion for docker"
DESCRIPTION = "Fish command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.4_ce"

RPM_NAME = "docker-fish-completion-24.0.4_ce-1.1.noarch.rpm"
RPM_HASH = "97453369b9c7f475dd42c6e0758387660caf91582986f9e89aebf4d367679a8c0bccd1b34f582fa1eeba85bb0eb7b1b740474ee2e2b1efffe7f08c5edaa61f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion"

RDEPENDS:${PN} += "docker \
fish"

inherit rpm
