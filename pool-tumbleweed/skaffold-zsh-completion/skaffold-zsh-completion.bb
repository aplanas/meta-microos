SUMMARY = "Zsh Completion for skaffold"
DESCRIPTION = "zsh command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "skaffold-zsh-completion-2.7.0-1.1.noarch.rpm"
RPM_HASH = "905ffe1b046443214a25d4e05f23ede9a4e005fe56cef37d20b731e657b87a05da83ec44837d0927dce5d0a2542d6969f4e7a82cfd904d29d41a143bde3e3329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-zsh-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
