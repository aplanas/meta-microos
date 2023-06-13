SUMMARY = "Zsh Completion for velero"
DESCRIPTION = "Zsh command line completion support for velero."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "velero-zsh-completion-1.9.2-1.3.noarch.rpm"
RPM_HASH = "72e6f8cb4c89d3f99019bf405f55c5ccb0565d993bd6711a03476a777374dca51358315104e400bc48c1585d3938dcf0c3aa8aa18e0ba5083556d922ca16de03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velero-zsh-completion"

RDEPENDS:${PN} += "velero"

inherit rpm
