SUMMARY = "Bash Completion for zola"
DESCRIPTION = "Bash command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-bash-completion-0.17.2-2.1.noarch.rpm"
RPM_HASH = "f3479296bb271736b23a02b21503c5232b9325a4ded213df91790006959200f213be74d94ab2cb603afbac77451d2355d5e567a319106641672c84e194b5d5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
