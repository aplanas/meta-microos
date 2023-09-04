SUMMARY = "Bash Completion for lf"
DESCRIPTION = "Bash command-line completion support for lf."
LICENSE = "MIT"

PV = "30+dd82949"

RPM_NAME = "lf-bash-completion-30+dd82949-1.1.noarch.rpm"
RPM_HASH = "ae58b99ff16b21dfb67c196d1a58db368bfeea5e8531a54a2e11e7f9612595be9a556e37fdd46425e49a2ed5db2beedded004b4c37a1b4317386de188b848e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
