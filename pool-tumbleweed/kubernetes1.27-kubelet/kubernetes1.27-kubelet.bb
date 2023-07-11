SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-kubelet-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "e5fd2af32f8681c8cc04348ccccecb4b978026a117887d7cc25d70d9c084286bbcc27cb01133a183a869e2f93a7c79c7e581200d52fb3d83cf649ccbdb18314a"

RPROVIDES:${PN} += "kubernetes-kubelet1.27 \
kubernetes1.27-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
