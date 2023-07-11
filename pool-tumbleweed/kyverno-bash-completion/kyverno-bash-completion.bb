SUMMARY = "Bash Completion for kyverno"
DESCRIPTION = "Bash command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kyverno-bash-completion-1.10.1-1.1.noarch.rpm"
RPM_HASH = "df8165e1a0fa99275e45b3911fdd0d8d96cf02de1b9cbbfb785e9a9459fc47219b4243ed264a79f57c694da8dace1414ad9578bd8a9bdeeab6494bc38a2acb15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kyverno"

inherit rpm
