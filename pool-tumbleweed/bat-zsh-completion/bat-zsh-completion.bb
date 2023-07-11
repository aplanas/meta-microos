SUMMARY = "Zsh completion for bat"
DESCRIPTION = "Zsh command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-zsh-completion-0.23.0-1.2.noarch.rpm"
RPM_HASH = "a6a1f6a66d6b818e61b1eed1a39cfc29a742c5d2053730865f555ffa2c26f0eed5039e7564d47514a95cd9296bd28175ec095c69f8eb32cdc223a2b50b814bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-zsh-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
