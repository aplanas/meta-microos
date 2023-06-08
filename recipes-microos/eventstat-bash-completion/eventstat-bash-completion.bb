SUMMARY = "Bash Completion for eventstat"
DESCRIPTION = "Bash completion script for eventstat."
LICENSE = "GPL-2.0-or-later"

PV = "0.04.13"

RPM_NAME = "eventstat-bash-completion-0.04.13-1.5.noarch.rpm"
RPM_HASH = "d077a4611619bc1d13b26b719091e71ef1401a311e9a69aedd83595461b2e85acc99deb92bc03865d9548680844413d7b9a2f285f512d593f70ec115ebf185cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eventstat-bash-completion"
RDEPENDS:${PN} += "bash-completion eventstat"

inherit rpm
