SUMMARY = "Bash Completion for kubernetes1.24-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.24-client"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-client-bash-completion-1.24.16-1.1.noarch.rpm"
RPM_HASH = "eee2331ea4f17432d5f62efac9db02a08db6abbc5491a3e86ba0b65c2f6f4c0fe2b92bc45c67f156bcb60c0dd133b607bd0205024f0f8198f2410bca833cdd20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.24-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.24-client"

inherit rpm
