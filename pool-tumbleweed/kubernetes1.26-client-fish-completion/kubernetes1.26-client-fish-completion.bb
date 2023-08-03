SUMMARY = "Fish Completion for kubernetes1.26-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.26-client."
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-fish-completion-1.26.7-1.1.noarch.rpm"
RPM_HASH = "5ebf9e0ee42e31a7dc454890ae6976aac0b6a4582a753dba5869f694904436695b7878904aaf89c4103c0109969b9f6ecaa4a2de98b6f19814f2edd156e577f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.26-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.26-client"

inherit rpm
