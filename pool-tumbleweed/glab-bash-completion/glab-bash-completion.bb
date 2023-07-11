SUMMARY = "Bash completion for glab"
DESCRIPTION = "Bash command line completion support for glab."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "glab-bash-completion-1.31.0-1.1.noarch.rpm"
RPM_HASH = "11d6cbe1a30d82dc1b0b42e6da8726b831c0fc2026c2a2673e5e0d7b5d5511c54a55e3eca9f5a496d697198b200a5cde42f7aff8493878b265f17db7cf7e78fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-bash-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
