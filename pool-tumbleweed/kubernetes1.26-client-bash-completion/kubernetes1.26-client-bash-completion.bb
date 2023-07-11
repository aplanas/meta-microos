SUMMARY = "Bash Completion for kubernetes1.26-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.26-client"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-client-bash-completion-1.26.6-1.1.noarch.rpm"
RPM_HASH = "545bb9d13212cf3ba6593c9d213685fddf9e12c7a6ef17ad201298760bc34638a74c82bcdf62d6f010c37b88934619559a83fb3710b7c8147f161b3e5b25deaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.26-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.26-client"

inherit rpm
