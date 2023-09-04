SUMMARY = "Fish Completion for kubernetes1.26-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.26-client."
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-fish-completion-1.26.7-2.1.noarch.rpm"
RPM_HASH = "730f337fc4956daafe3eae702761d62268e6a95cfae24d8c95dcb1054e902fb99fdb5d3dfe6c11c4cf0a1d73fdd3889c3f45d5ad9ae5011bdb0bd423b903baae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.26-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.26-client"

inherit rpm
