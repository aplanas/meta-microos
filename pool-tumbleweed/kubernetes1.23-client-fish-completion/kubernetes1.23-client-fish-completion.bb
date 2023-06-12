SUMMARY = "Fish Completion for kubernetes1.23-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.23-client."
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-fish-completion-1.23.17-3.1.noarch.rpm"
RPM_HASH = "28eb11178ec3c901dcf82385141e05277bf9202de2f2404a72cab983fd89767f80b8abc5f806d51330e7557422e2c1a953b5c4dcb2921afd6a2b3ed456c8f2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.23-client-fish-completion"
RDEPENDS:${PN} += "kubernetes1.23-client"

inherit rpm
