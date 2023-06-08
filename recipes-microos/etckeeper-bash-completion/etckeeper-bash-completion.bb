SUMMARY = "The bash completion for etckeeper"
DESCRIPTION = "Bash command line completion support for etckeeper."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.18"

RPM_NAME = "etckeeper-bash-completion-1.18.18-2.2.noarch.rpm"
RPM_HASH = "86c1dd1749c400d37833069f7ed36b3ff4240b3f61cf475e554f9601b9b94026ecc68e71147d1adbc046adbdafab4d9d5c4b657b16e9aa7f2df4e0ceddc65c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-bash-completion"
RDEPENDS:${PN} += "bash-completion etckeeper"

inherit rpm
