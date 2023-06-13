SUMMARY = "Bash Completion for kubernetes1.25-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.25-client"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-bash-completion-1.25.9-1.2.noarch.rpm"
RPM_HASH = "a61cd3411678ca1357062b91294654a391ca4b269f1cc0dea3b3fe1dcebcee3e5b174f06e2df78fd877caac662660685146607b9efabb5ade4d6c4e0994da318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.25-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.25-client"

inherit rpm
