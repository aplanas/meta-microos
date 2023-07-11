SUMMARY = "Bash Completion for kubernetes1.21-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.21-client"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-bash-completion-1.21.14-2.3.noarch.rpm"
RPM_HASH = "4afec1df88f4dc82bdc3549e37763ebcfcfffc4cf3b737c6bfd661a0d980258c46925a97d1e4d5620ec05f2359fc08689c025c6edc12a6556ed9391eced7c6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.21-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.21-client"

inherit rpm
