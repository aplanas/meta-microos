SUMMARY = "Kubernetes client credential plugin implementing Azure authentication"
DESCRIPTION = "A client-go credential (exec) plugin implementing azure authentication. This plugin provides features \
that are not available in kubectl. It is supported on kubectl v1.11+"
LICENSE = "MIT"

PV = "0.0.30"

RPM_NAME = "kubelogin-0.0.30-1.1.aarch64.rpm"
RPM_HASH = "456aaacfaa5d7e9e3a453116cf8eebb9e12601d5746a83a52ef7bb237ab5b91f15f3de75cdbadf2fbd5c581cff2983afff3edeb6b39a5af27829de7d7c1d18ab"

RPROVIDES:${PN} += "kubelogin"

RDEPENDS:${PN} += ""

inherit rpm
