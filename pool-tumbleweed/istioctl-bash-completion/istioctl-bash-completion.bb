SUMMARY = "Bash Completion for istioctl"
DESCRIPTION = "Bash command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.18.2"

RPM_NAME = "istioctl-bash-completion-1.18.2-1.1.noarch.rpm"
RPM_HASH = "b7bf8c3027c62d7c8b7d5ff51d3547d5ea6a12faee2ebbb42a57bdc0294cbd1e7413560b30d211a812f836c79dd3193ef14c64b0136e44a02bd15a033cf65c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
istioctl"

inherit rpm
