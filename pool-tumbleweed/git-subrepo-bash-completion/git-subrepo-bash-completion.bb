SUMMARY = "Bash completion for git-subrepo"
DESCRIPTION = "Bash shell completions for git-subrepo"
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "git-subrepo-bash-completion-0.4.6-1.1.noarch.rpm"
RPM_HASH = "cb64e63cb2459bd245180605bd3b9be3c21cbf370e19b5f18f6b0f9c0dcfa4038c0c5b97f1579d3b350b8462137473b33e308206cef03136dcefb32de989f7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-subrepo-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
