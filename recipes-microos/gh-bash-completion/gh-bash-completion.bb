SUMMARY = "Bash Completion for gh"
DESCRIPTION = "Bash command line completion support for gh."
LICENSE = "MIT"

PV = "2.28.0"

RPM_NAME = "gh-bash-completion-2.28.0-1.1.noarch.rpm"
RPM_HASH = "8c42857924021721428063962232d7bde6512718388d3fefeb88b807a5bc10e7843632920a240dabd2ae3199f73221af6a8e86d62eb3c97071529331d624fd75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-bash-completion"
RDEPENDS:${PN} += "bash-completion gh"

inherit rpm
