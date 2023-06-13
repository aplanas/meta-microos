SUMMARY = "Bash Completion for kubernetes1.22-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.22-client"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-bash-completion-1.22.17-2.2.noarch.rpm"
RPM_HASH = "4a1435939ff5857c43be8e09af12ff13590b00c3a5362e8634188d2d87c73ae8b6f222e7840a9db044e9887892fa48ebc833105025d515fc36dc0f3aa96521d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.22-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.22-client"

inherit rpm
