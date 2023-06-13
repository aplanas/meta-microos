SUMMARY = "Bash Completion for kyverno"
DESCRIPTION = "Bash command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "kyverno-bash-completion-1.10.0-1.1.noarch.rpm"
RPM_HASH = "a69adc13305ee699497a41f88c70c838e2f3fa9e8f97248c47e11a77b90e728ff24f90771754195b4d8f458ee09f4fcdedfd31eb2ffe9c4bb9fdbc541b1c79c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kyverno"

inherit rpm
