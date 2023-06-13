SUMMARY = "Bash Completion for kompose"
DESCRIPTION = "The official bash completion script for kompose, generated during the build."
LICENSE = "Apache-2.0"

PV = "1.26.1"

RPM_NAME = "kompose-bash-completion-1.26.1-1.9.noarch.rpm"
RPM_HASH = "3461ec227716b15ddd84ec97b741046163cbfd3bef163e61873d9900a4b658a3392b831c2ebf5ca89ebe818bd8064a0d4ca1cf7792b36fc0d1e08add53447637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompose-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
