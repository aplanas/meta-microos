SUMMARY = "Fish Completion for kubernetes1.27-client"
DESCRIPTION = "Fish command line completion support for kubernetes1.27-client."
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-client-fish-completion-1.27.3-1.1.noarch.rpm"
RPM_HASH = "1489b18701b12edb5f948b40e94a2a513a05f5ea2756c0f842ff9cf94f6e05fe3c169b6664603fa16cd42db676e2909fa0b915400a886561175242182e4a52ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubernetes-client-fish-completion \
kubernetes1.27-client-fish-completion"

RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
