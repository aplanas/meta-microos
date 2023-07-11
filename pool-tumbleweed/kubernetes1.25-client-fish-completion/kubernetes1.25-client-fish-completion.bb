SUMMARY = "Fish Completion for kubernetes1.25-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.25-client."
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-client-fish-completion-1.25.11-1.1.noarch.rpm"
RPM_HASH = "907a22929c04880ec8843dc56b175a88a2656fd1e9f832250ba522c26d35a2c253d327a955826c85eaebc818160ff997c2206777197605bec36f0eb613175fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.25-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.25-client"

inherit rpm
