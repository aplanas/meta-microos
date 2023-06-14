SUMMARY = "Kubernetes client credential plugin implementing Azure authentication"
DESCRIPTION = "A client-go credential (exec) plugin implementing azure authentication. This plugin provides features \
that are not available in kubectl. It is supported on kubectl v1.11+"
LICENSE = "MIT"

PV = "0.0.24"

RPM_NAME = "kubelogin-0.0.24-1.4.aarch64.rpm"
RPM_HASH = "61cbe345d151e8b4195d8cd61bac5519e1106e4f76101e90a22e6a3ce867db1a6c67551f0ba1d0e4b9534e34e598673f538d81160badf273b1bcc461d07242fa"

RPROVIDES:${PN} += "kubelogin"

RDEPENDS:${PN} += ""

inherit rpm
