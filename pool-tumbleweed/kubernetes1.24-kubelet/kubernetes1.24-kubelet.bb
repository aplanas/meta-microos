SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-kubelet-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "9ee06667510d142294997742446aa323cc81ddeb717fd0c2fed349bd335ef9aa84d12be487e67093bfd9737fb3999cf2e9b2d46521eed7e824e657905a8ac628"

RPROVIDES:${PN} += "kubernetes-kubelet1.24 \
kubernetes1.24-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
