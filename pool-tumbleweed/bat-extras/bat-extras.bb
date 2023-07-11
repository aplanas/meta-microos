SUMMARY = "Extra scripts for bat"
DESCRIPTION = "Bash scripts that integrate bat with various command line tools."
LICENSE = "MIT"

PV = "2023.06.15"

RPM_NAME = "bat-extras-2023.06.15-1.1.noarch.rpm"
RPM_HASH = "5e94a5ffbfdbbf123c241883713555f2c88766895eed993381c9cc466b79ab6448fefc49b06aee2fee51a9c31faa2860811b70d70438af677ed0d6a74c4f00a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-extras"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
bat"

inherit rpm
