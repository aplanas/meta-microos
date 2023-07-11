SUMMARY = "Bash Completion for kubernetes1.25-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.25-client"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-client-bash-completion-1.25.11-1.1.noarch.rpm"
RPM_HASH = "d26b9085a7ba2ef069975a7352ff29a02035e59326bc03d7d273cdbf1d94a93c3d4903223da8c1e97a0ff3332447d50fbbc9684bbd827b59b470a32d97f6d29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.25-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.25-client"

inherit rpm
