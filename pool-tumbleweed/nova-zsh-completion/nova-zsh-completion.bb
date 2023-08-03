SUMMARY = "Zsh Completion for nova"
DESCRIPTION = "zsh command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "nova-zsh-completion-3.7.0-1.1.noarch.rpm"
RPM_HASH = "64a7e1646f3d909b66dc5d55b5d35c6601bdcd506af95f48d46c69f8f662a0491609b7632f218e334caaa38008667e65cb38d56fd8fad0301f54925b8bbb4b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-zsh-completion"

RDEPENDS:${PN} += "nova"

inherit rpm
