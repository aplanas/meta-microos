SUMMARY = "Fish Completion for kubernetes1.24-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.24-client."
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-client-fish-completion-1.24.15-2.1.noarch.rpm"
RPM_HASH = "35de7060e62e62f0ea00fdc74fa2fb10668468a3fb9ddbca4cb55a67af4444c014029d60d0fbc4635919d8bdbd9058107a60ac7c9f990745b8dde62e0cc073bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.24-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.24-client"

inherit rpm
