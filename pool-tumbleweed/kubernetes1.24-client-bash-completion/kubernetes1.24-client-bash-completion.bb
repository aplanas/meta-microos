SUMMARY = "Bash Completion for kubernetes1.24-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.24-client"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-client-bash-completion-1.24.15-2.1.noarch.rpm"
RPM_HASH = "807c08c10b4a23952da198f796b37667633b9106f0be230a724f2a3d432c6ea37f581233953de8c9669972794784e6553a2c59c058c6811d6b53ec60eef7706c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.24-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.24-client"

inherit rpm
