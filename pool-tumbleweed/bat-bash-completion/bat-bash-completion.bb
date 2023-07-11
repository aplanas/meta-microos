SUMMARY = "Bash completion for bat"
DESCRIPTION = "Bash command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-bash-completion-0.23.0-1.2.noarch.rpm"
RPM_HASH = "66686bcae35a434f982ec317902553a0ffe16497c061d1f8e886dc7d43efe52ef492720f9c88fdd0694a59e7ded126812a377e4e17a055b7e7b72675e02ad26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-bash-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
