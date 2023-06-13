SUMMARY = "Bash Completion for kubernetes1.23-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.23-client"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-bash-completion-1.23.17-3.1.noarch.rpm"
RPM_HASH = "55aee078749d30bb46aa98da71f6b5be81c0e57120b64dcd6a905006dd55eff7b4363ef101db575782b58de32a8c404b30eec325f1e3f00163f08441ac31554e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.23-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.23-client"

inherit rpm
