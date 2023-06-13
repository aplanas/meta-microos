SUMMARY = "Zsh completion for bat"
DESCRIPTION = "Zsh command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-zsh-completion-0.23.0-1.1.noarch.rpm"
RPM_HASH = "d6550403c0083de802b49827ddb500d48aeab5fec96fbea186dda7f104096feda7ec18e698b88a982eae18e6d15f520cca12d01870a3eebd977c31147fd76e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-zsh-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
