SUMMARY = "Bash Completion for kubernetes1.27-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.27-client"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-bash-completion-1.27.4-1.1.noarch.rpm"
RPM_HASH = "e8a697836b1f55d9428616dabe434d33029cf853763cffd9fd973f86d874796d3be9ba84ee4251bb9aba54f4e6ff032b869dde0f8658d738abca67e8bb411cc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.27-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.27-client"

inherit rpm
