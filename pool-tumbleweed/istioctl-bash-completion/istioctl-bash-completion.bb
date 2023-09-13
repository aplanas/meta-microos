SUMMARY = "Bash Completion for istioctl"
DESCRIPTION = "Bash command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "istioctl-bash-completion-1.19.0-1.1.noarch.rpm"
RPM_HASH = "1b8d8b4c162be815f852b797cba8cb9a1bf6400c232d1086e4cfcb8ebf666fcc74ee03fc4f34bef8f67978280c7dfa9a237433f7587b5f5f4a60d6b4cc54e8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
istioctl"

inherit rpm
