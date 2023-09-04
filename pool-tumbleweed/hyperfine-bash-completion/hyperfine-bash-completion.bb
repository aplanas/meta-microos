SUMMARY = "Bash Completion for hyperfine"
DESCRIPTION = "The official bash completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.17.0"

RPM_NAME = "hyperfine-bash-completion-1.17.0-2.1.noarch.rpm"
RPM_HASH = "d72a23bc908fc4d2b55d32124cb8eeda5ed3a66a12764ad3b295cf048149d34d7d0fccb2c8dfa9c7d7af75d7e57e4f09f893a5c32d301d119375e31e8416a25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
