SUMMARY = "Bash completion for fzf"
DESCRIPTION = "Bash shell completions for fzf"
LICENSE = "MIT"

PV = "0.40.0"

RPM_NAME = "fzf-bash-completion-0.40.0-1.1.noarch.rpm"
RPM_HASH = "b313b76f2727a70234766ac845af2a5a8e36e9b5cc52e9bd9eee2a2cabf82673108ce2cd31b54eed40d17553dfddf8ea59d30c85ddad726acdb9d7b3e98147bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-bash-completion"
RDEPENDS:${PN} += "bash-completion fzf"

inherit rpm
