SUMMARY = "Bash Completion for pagemon"
DESCRIPTION = "Bash completion script for pagemon."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.01"

RPM_NAME = "pagemon-bash-completion-0.02.01-1.2.noarch.rpm"
RPM_HASH = "5fd7f6632bcb298f6daf4fabdad1b04ba6e961fc91bf68b573989ce8482d8018bca92ce302e65b6b444ab8c574ea80054c54ace0a507926ceb508685068c7e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagemon-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pagemon"

inherit rpm
