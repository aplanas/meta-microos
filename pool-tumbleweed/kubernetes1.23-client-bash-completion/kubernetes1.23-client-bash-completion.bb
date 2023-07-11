SUMMARY = "Bash Completion for kubernetes1.23-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.23-client"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-bash-completion-1.23.17-5.1.noarch.rpm"
RPM_HASH = "4afeed749bdbadd9894af9bd663f34601ce5b8b41b144baf2767c79e7b923888acf9be72e3a644aafa85b4148ca1ddc16ee0fdf2c92b0413b44ce2ff2ea3b605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.23-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.23-client"

inherit rpm
