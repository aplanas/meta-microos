SUMMARY = "Fish Completion for kubernetes1.25-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.25-client."
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-client-fish-completion-1.25.12-1.1.noarch.rpm"
RPM_HASH = "f27e6b841bb7b3ecc0bc811881ce1420e0434fd3b1da3d7e51488821857c5924295fcb4c7ab932fc753bea245e373bf6cb23644552ff062988ea5132625e155a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.25-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.25-client"

inherit rpm
