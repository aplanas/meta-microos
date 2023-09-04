SUMMARY = "Bash Completion for kubernetes1.27-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.27-client"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-bash-completion-1.27.4-2.1.noarch.rpm"
RPM_HASH = "d69ade74ca11be7d43c4be67dfed83f1dd90a072dd76960da224cb166ccf0d4edb20f6ae0864c45b1f5f79955ee423effa83bd2c52d064e4cb80863054c8a13a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.27-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.27-client"

inherit rpm
