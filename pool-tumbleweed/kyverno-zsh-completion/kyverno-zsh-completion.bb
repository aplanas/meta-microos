SUMMARY = "Zsh Completion for kyverno"
DESCRIPTION = "zsh command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "kyverno-zsh-completion-1.10.0-1.1.noarch.rpm"
RPM_HASH = "ed76932b56a9c685874bf1510fb0a11700b9b00cf89758b2af7382dc4c307a439d5c38139598c53b9f9db398c809dfeb54a6187e1f42246341094f1701bae93f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-zsh-completion"
RDEPENDS:${PN} += "kyverno"

inherit rpm
