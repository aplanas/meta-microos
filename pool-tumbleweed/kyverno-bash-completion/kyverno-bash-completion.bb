SUMMARY = "Bash Completion for kyverno"
DESCRIPTION = "Bash command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "kyverno-bash-completion-1.10.3-1.1.noarch.rpm"
RPM_HASH = "3ce3c3ceaf6e8cede52a701c3be93582a8d88713247acb91ace05a977c85485ca53646cc80c0e32e8f2baa6cd6fbfa1820b3405fc0fa5e87f71bb16fc9ba5da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kyverno"

inherit rpm
