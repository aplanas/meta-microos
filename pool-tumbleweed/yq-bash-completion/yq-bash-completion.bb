SUMMARY = "Bash Completion for yq"
DESCRIPTION = "Bash command line completion support for yq."
LICENSE = "MIT"

PV = "4.34.2"

RPM_NAME = "yq-bash-completion-4.34.2-1.1.noarch.rpm"
RPM_HASH = "049ae60b1b9cc53111942f1a11873cd7d7b76c064bd7163ab984500d4cbfe1e3cc837de821e13a11de8be8b44e98e4d7d3612f576c74dfa1616bbba4814ae83b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-bash-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
