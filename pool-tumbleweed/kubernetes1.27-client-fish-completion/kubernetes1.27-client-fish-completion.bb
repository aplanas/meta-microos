SUMMARY = "Fish Completion for kubernetes1.27-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.27-client."
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-fish-completion-1.27.4-1.1.noarch.rpm"
RPM_HASH = "1f7a1ef7ae0eda1a83e94de926a00cfd1eb999d0f58aed23af167a21b153a80d97148107ac2578855d76924a319e429eead6e5130e3f6f73fa9477732f933d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.27-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
