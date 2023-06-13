SUMMARY = "Bash completion for bat"
DESCRIPTION = "Bash command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-bash-completion-0.23.0-1.1.noarch.rpm"
RPM_HASH = "1e0d570dc7aa315e49bd5c5883e722dcec0579c1fcb0b7fa496d90f99a30e2d42861dac3aef766d996e93b930ce9be0fe9b1a550c51fe4e90fbb8b342d2c98a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-bash-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
