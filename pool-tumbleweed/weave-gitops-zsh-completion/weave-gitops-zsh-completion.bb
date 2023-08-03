SUMMARY = "Zsh Completion for weave-gitops"
DESCRIPTION = "zsh command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.28.0"

RPM_NAME = "weave-gitops-zsh-completion-0.28.0-1.1.noarch.rpm"
RPM_HASH = "bddc24ee2f1485f4e0a67ab303416c975787161eb7be6e0ef17a45685ff383b48acad1d6de4e157f35e9031be85814d797d1575864d4f7febfed31ff8f807df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-zsh-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
