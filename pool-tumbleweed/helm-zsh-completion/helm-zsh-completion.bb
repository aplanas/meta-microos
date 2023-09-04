SUMMARY = "Zsh Completion for helm"
DESCRIPTION = "Zsh command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.3"

RPM_NAME = "helm-zsh-completion-3.12.3-1.1.noarch.rpm"
RPM_HASH = "d1c3a850750fa4cc18c9c14d6367dcd87f73935b79a08967a6dc0f94174055a4be7034a014ce9819c961677d78416d2587fa3613c60a59a6ced344cd12603ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-zsh-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
