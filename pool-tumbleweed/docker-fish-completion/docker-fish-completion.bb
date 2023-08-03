SUMMARY = "Fish completion for docker"
DESCRIPTION = "Fish command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-fish-completion-24.0.5_ce-1.1.noarch.rpm"
RPM_HASH = "d92273a55987c513d24f1666cbf0c0a3854a546586d2939e267192c28c51ef0eabc93235e1d97a10d0cf71a68717c3c8a22ac3f447f11c90047cb5c978ad4547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion"

RDEPENDS:${PN} += "docker \
fish"

inherit rpm
