SUMMARY = "Zsh Completion for fuzzel"
DESCRIPTION = "Zsh command-line completion support for fuzzel"
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "fuzzel-zsh-completion-1.9.1-2.2.aarch64.rpm"
RPM_HASH = "90be33a261212f8f9a585196694ef84dcac4c5b8e2356b092929ec0ac359b207a92c7f5bd24e6bcbcba564b96b7d754e4abf4c0679cac24d372a389b4a121781"

RPROVIDES:${PN} += "fuzzel-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
