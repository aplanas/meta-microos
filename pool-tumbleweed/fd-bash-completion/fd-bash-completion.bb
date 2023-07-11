SUMMARY = "Bash Completion for fd"
DESCRIPTION = "The official bash completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "8.7.0"

RPM_NAME = "fd-bash-completion-8.7.0-1.4.noarch.rpm"
RPM_HASH = "58ecdffe00efe82d753e438eca7f2ad043d1ac2617dbd30973dc70880f1c5fe0f822f9e946a0d923c1cb12e393287c940d8dca07704beda92e8287f98a752235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
