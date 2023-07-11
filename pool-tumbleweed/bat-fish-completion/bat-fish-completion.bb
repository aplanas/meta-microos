SUMMARY = "Fish completion for bat"
DESCRIPTION = "Fish command line completion support for bat."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-fish-completion-0.23.0-1.2.noarch.rpm"
RPM_HASH = "b407b107bbe4ac167fb7062cbc1a699d3c89e38f69d590d66a3a34faedc69eb8687a08b28b55d22c4fd8dcbe35ab1542f4c7f83858325397a0a5e57ff177cc3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bat-fish-completion"

RDEPENDS:${PN} += "bat"

inherit rpm
