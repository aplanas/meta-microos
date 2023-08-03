SUMMARY = "Zsh Completion for kyverno"
DESCRIPTION = "zsh command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kyverno-zsh-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "f1368d5218b3e9b9f259cbefc6d3d6093c53c351f3556bebedf693806ccb8317881da820cfad8377570a760a118789989e53989e38851a4dc460fdd693330e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-zsh-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
