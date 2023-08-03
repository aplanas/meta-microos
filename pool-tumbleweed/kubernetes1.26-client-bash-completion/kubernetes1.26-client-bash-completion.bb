SUMMARY = "Bash Completion for kubernetes1.26-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.26-client"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-bash-completion-1.26.7-1.1.noarch.rpm"
RPM_HASH = "9a4ebb7470b5178d98297e3cce403e4dce27bd128d19c42b86e82082ca9a23b1a7624648b4ec5b427a6d8527c36a576d5914c8e7931ba9ce06ab09fbc9a6c1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.26-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.26-client"

inherit rpm
