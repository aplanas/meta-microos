SUMMARY = "Bash Completion for kubernetes1.26-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.26-client"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-bash-completion-1.26.4-1.2.noarch.rpm"
RPM_HASH = "9b2aa621ea361858a411c7cf3756bee4fa4555231b557be3e45ca42910e22a434b69f68e3de44b8534f1611ba5692ef6edc420d277936937c95c518ccbd399e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.26-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.26-client"

inherit rpm
