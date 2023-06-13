SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-kubelet-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "ae09fe66c90e53d2db606dff84951011d4d2a27f7f9bc60b3dbf5562305933e22c381c4bd9f0c47c9239b424edacfd587a455c9ba93d8facce74a2ebb6dc4bb8"

RPROVIDES:${PN} += "kubernetes-kubelet1.26 \
kubernetes1.26-kubelet \
kubernetes1.26-kubelet(aarch-64)"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6(GLIBC_2.34)(64bit) \
systemd"

inherit rpm
