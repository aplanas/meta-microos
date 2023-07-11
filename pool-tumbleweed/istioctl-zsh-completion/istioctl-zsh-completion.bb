SUMMARY = "Zsh Completion for istioctl"
DESCRIPTION = "zsh command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "istioctl-zsh-completion-1.18.0-1.1.noarch.rpm"
RPM_HASH = "7a9953b084ce2e2f98f1ba52ab090c4cabc1673f2fc8c8cdd06a4fb517c9d20ce640091072e1f82cf420204f1f41766d02e61847758d0657348ab2267f997075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-zsh-completion"

RDEPENDS:${PN} += "istioctl"

inherit rpm
