SUMMARY = "Bash Completion for kubernetes1.26-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.26-client"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-bash-completion-1.26.7-2.1.noarch.rpm"
RPM_HASH = "6619497a709bf705484eed9c2ed2af0976dc775a987ecc7c7828967ce3fb2dfd04861f921aa292b2379a92256a15124f7961651feeca696d6f5b2a02fb3a0c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.26-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.26-client"

inherit rpm
