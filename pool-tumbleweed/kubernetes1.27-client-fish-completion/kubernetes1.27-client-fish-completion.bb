SUMMARY = "Fish Completion for kubernetes1.27-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.27-client."
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-fish-completion-1.27.4-2.1.noarch.rpm"
RPM_HASH = "1b715891769a155ee1ffb673662898b272077f529364a130c00848e63e40e59daa537ad124ff20d9ea1dcb64d52456b66d2f82910ae758a6ebc4a62387d0945a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.27-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
