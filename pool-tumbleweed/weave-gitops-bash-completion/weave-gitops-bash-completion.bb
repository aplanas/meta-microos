SUMMARY = "Bash Completion for weave-gitops"
DESCRIPTION = "Bash command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.31.2"

RPM_NAME = "weave-gitops-bash-completion-0.31.2-1.1.noarch.rpm"
RPM_HASH = "4103c1545c146e0a6c7a6664da4247c6bf469292107d31a1f1bec2db0f186a7283894d9d2f9c2349146d50d2141447a2c7c659af8fca58aa9563c042c82ca40a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-bash-completion"

RDEPENDS:${PN} += "bash-completion \
weave-gitops"

inherit rpm
