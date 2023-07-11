SUMMARY = "Fish completion for docker"
DESCRIPTION = "Fish command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.2_ce"

RPM_NAME = "docker-fish-completion-24.0.2_ce-2.1.noarch.rpm"
RPM_HASH = "6f44a78d8e64457a4c71bdfef443d725a3d08a6bc829a7d63eb8bcd88ed938eb99a4d6263ad7d862110a28a846084401dc5ce1c53f8c077fa9212d9c8e0904a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-fish-completion"

RDEPENDS:${PN} += "docker \
fish"

inherit rpm
