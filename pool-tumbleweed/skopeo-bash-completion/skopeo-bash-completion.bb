SUMMARY = "Bash completion for skopeo"
DESCRIPTION = "This package contains the bash completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "skopeo-bash-completion-1.13.0-1.1.noarch.rpm"
RPM_HASH = "a554213386908445df7f48b7efccc3c189e7d883748623890a589dcd7f859c8ac84ec8ea06d34102abc2e2c53bcb29136bb33071034eda356d70e3260b5be34a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skopeo"

inherit rpm
