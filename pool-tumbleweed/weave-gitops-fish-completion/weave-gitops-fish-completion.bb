SUMMARY = "Fish Completion for weave-gitops"
DESCRIPTION = "Fish command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.28.0"

RPM_NAME = "weave-gitops-fish-completion-0.28.0-1.1.noarch.rpm"
RPM_HASH = "c4c8788ce81ec9085c1358edc73c1cb792766ead455ba559a6b25aa33af8b31feb9914007e9bf461c1b9840adba5adde3a177180cfac5a85c5054a961a4305e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-fish-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
