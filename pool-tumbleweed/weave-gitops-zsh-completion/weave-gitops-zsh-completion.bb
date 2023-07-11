SUMMARY = "Zsh Completion for weave-gitops"
DESCRIPTION = "zsh command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.27.0"

RPM_NAME = "weave-gitops-zsh-completion-0.27.0-1.1.noarch.rpm"
RPM_HASH = "143935cf4ee87921c409d8395f6c0566b8867cb9942c8a7178721e300ee35e08c320e2fefbec99d6687b07781852551ab55fc4dea82a36361d2248b56d995170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-zsh-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
