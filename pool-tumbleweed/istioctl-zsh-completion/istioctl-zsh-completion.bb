SUMMARY = "Zsh Completion for istioctl"
DESCRIPTION = "zsh command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.17.2"

RPM_NAME = "istioctl-zsh-completion-1.17.2-2.2.noarch.rpm"
RPM_HASH = "9f1730aa5f6da7bbb4e57be584f4e524d8825f05b9e7cdd9ac4fb00fccb0856fd7f6d7719fb38185a6c5649cc102f778a4d50ec3518de479a54eac14d8069b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-zsh-completion"
RDEPENDS:${PN} += "istioctl"

inherit rpm
