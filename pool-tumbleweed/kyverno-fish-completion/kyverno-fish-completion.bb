SUMMARY = "Fish Completion for kyverno"
DESCRIPTION = "Fish command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "kyverno-fish-completion-1.10.1-1.1.noarch.rpm"
RPM_HASH = "1ea886035a848d529d66fb141208f6136ab6f0d50efcb6a209798e02a7944505b5a8b11904d7836f907a1680f245aec98f6b21c11825c6264cb5abd1de2e1286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-fish-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
