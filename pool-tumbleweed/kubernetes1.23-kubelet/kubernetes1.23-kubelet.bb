SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-kubelet-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "5f407d420baa5b3e596507f88983b21ae578807b8a47bc9e8807eb51d7bd93c3db9688b027c7123aa7e8277bb7da0e776a87ff67d40483c08944e5b13c8e378e"

RPROVIDES:${PN} += "kubernetes-kubelet1.23 \
kubernetes1.23-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
