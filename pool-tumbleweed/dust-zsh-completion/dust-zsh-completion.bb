SUMMARY = "ZSH completion for dust"
DESCRIPTION = "ZSH completion script for dust."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-zsh-completion-0.8.6-1.1.noarch.rpm"
RPM_HASH = "b06c4152d9443a3ed645332d21ef6294eada831d9ecec74dd5ffa85214ba780b3c6699a53e72a989d74171807a00bc30ddd0d1ec3c90a4cc3c4d13413c844dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-zsh-completion"
RDEPENDS:${PN} += "zsh"

inherit rpm
