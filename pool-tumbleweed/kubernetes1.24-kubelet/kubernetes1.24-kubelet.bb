SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-kubelet-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "ac6d026e1fec4bacbd646c0cf2733478fce6a7f16b128941b93076caacc69c0bab8a343fea379b50b1e86f5dfe3b8c6756c63a6afc9198a04ab2bc40cd3acaba"

RPROVIDES:${PN} += "kubernetes-kubelet1.24 \
kubernetes1.24-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
