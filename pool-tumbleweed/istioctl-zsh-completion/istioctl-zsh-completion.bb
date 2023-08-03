SUMMARY = "Zsh Completion for istioctl"
DESCRIPTION = "zsh command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.18.2"

RPM_NAME = "istioctl-zsh-completion-1.18.2-1.1.noarch.rpm"
RPM_HASH = "095635dd5ec824b61868f1fa452dc36a8a20421dfb0a98a8323966b0e9add4677335d5d9a519c2830a4311e8c30c94e9320660dfa03071b2e5ab9902500b8a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-zsh-completion"

RDEPENDS:${PN} += "istioctl"

inherit rpm
