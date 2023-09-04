SUMMARY = "Bash Completion for weave-gitops"
DESCRIPTION = "Bash command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.29.0"

RPM_NAME = "weave-gitops-bash-completion-0.29.0-1.1.noarch.rpm"
RPM_HASH = "103b6eca489d3d8e18141371e116e120983b1ff500b470589de3fbf0be4cdc997167e7188d06d9fbd56d95b1b0cae913d84bf7bb1e352378f2742d9134272574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-bash-completion"

RDEPENDS:${PN} += "bash-completion \
weave-gitops"

inherit rpm
