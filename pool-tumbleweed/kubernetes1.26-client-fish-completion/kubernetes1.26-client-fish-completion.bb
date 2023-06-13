SUMMARY = "Fish Completion for kubernetes1.26-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.26-client."
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-fish-completion-1.26.4-1.2.noarch.rpm"
RPM_HASH = "77e5399ac7cba149cd4689992d9311eed4f5a081a2e0f14aa338c972fca897b1de9cdad6277302e28d8cbe7d1db551049c4ab6da27da6195a5584ebee0a4280f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.26-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.26-client"

inherit rpm
