SUMMARY = "Bash Completion for istioctl"
DESCRIPTION = "Bash command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "istioctl-bash-completion-1.18.0-1.1.noarch.rpm"
RPM_HASH = "cdf3aa729f3d77cccb80bddab148305a7d70aaf3d83998dc55d77d896638df97f273053003c019c7eeff1b2cf252998148d0c568e0c217aa87d341e9d16f222e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
istioctl"

inherit rpm
