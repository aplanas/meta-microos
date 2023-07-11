SUMMARY = "Zsh Completion for kubeaudit"
DESCRIPTION = "zsh command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-zsh-completion-0.22.0-1.3.noarch.rpm"
RPM_HASH = "172571e8aa8de7a6e27871a74bfe9949ecc0943c89c1115263262244f3d25c39e1cb194ce139d0e7ca662e1a462000cbcf46d2af51c787aa5435c221af971c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-zsh-completion"

RDEPENDS:${PN} += "kubeaudit"

inherit rpm
