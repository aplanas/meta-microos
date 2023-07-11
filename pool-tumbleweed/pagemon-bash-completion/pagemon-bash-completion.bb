SUMMARY = "Bash Completion for pagemon"
DESCRIPTION = "Bash completion script for pagemon."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.01"

RPM_NAME = "pagemon-bash-completion-0.02.01-1.3.noarch.rpm"
RPM_HASH = "1624fa023171d277d0823ce337d0da6c841d2f160d78ad227a496b678026e361e465abaae8ce64018e98906966e331856918c5225238273ecb91c8590d8fb313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagemon-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pagemon"

inherit rpm
