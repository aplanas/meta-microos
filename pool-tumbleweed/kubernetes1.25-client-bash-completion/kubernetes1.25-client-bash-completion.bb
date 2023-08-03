SUMMARY = "Bash Completion for kubernetes1.25-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.25-client"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-client-bash-completion-1.25.12-1.1.noarch.rpm"
RPM_HASH = "b611cd0be8bd97bab2cd64ad038d7f856de778576b8eab7c34722c6ae9d3e952cf4045b209d200150f242f1d56f9dcb2ed48d6a803a930e6e00d0039197485b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.25-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.25-client"

inherit rpm
