SUMMARY = "Bash Completion for river"
DESCRIPTION = "Bash command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g109"

RPM_NAME = "river-bash-completion-0.2.4+g109-3.1.noarch.rpm"
RPM_HASH = "89b679c5ff46a0b9242f1e05c88952813df5c6f9b246995a9b6115f5e00ded52507fc95bcc05f7ac056ba06125c13799f12e61acd8fd285094b51e54aa7344eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
