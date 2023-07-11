SUMMARY = "Bash Completion for kubernetes1.22-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.22-client"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-bash-completion-1.22.17-2.3.noarch.rpm"
RPM_HASH = "de04e7e7057768f969a4e3c771d02a7bb98763716f8fcecf3af8f0758d4c447878ba4428a5a8f33baed4bef83980f98d1e9fbfe3440b46785cbba0efb471bf6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.22-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.22-client"

inherit rpm
