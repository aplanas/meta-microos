SUMMARY = "Bash Completion for kyverno"
DESCRIPTION = "Bash command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kyverno-bash-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "f5cdb6b85e6b41116a01b7d70b9e7c7da1d96059acdd6d8a585b706bb6f5ae4d9a2b461d81e86b2342745327323a5352e092dad8db578bc6b0f17c8aae77da6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kyverno"

inherit rpm
