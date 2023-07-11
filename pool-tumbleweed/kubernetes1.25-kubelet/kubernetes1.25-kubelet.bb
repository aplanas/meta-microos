SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-kubelet-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "19b1932bbb3b1201826837364f29ff0ecb45a6fe0436f662dafc8e15d6741e3ba8a5812d5725b784a7e249701c1c3b37b679fb84a20f036203e180528418a82a"

RPROVIDES:${PN} += "kubernetes-kubelet1.25 \
kubernetes1.25-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
