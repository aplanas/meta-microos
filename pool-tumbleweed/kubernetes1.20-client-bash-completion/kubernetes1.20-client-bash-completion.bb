SUMMARY = "Bash Completion for kubernetes1.20-client"
DESCRIPTION = "Bash command line completion support for kubernetes1.20-client"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-bash-completion-1.20.15-2.3.noarch.rpm"
RPM_HASH = "6946dba2144373aecf24f4011fd122ecebface4ae973c8d35803ea98cbc4ea33908f876e1a8ca39c56f7c4b074461768d6f526ceb25bf0f640f0733e73b464f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-bash-completion \
kubernetes1.20-client-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubernetes1.20-client"

inherit rpm
