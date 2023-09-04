SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-kubelet-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "79156c070931bf2f52cf6ab2bf6f93f29d5c335ad6d9cdfd8d951264e0d7f3c297e639110a3d34d1cd3ff195138e32d84bd6beba2fa59c8d5c2456819edd8c90"

RPROVIDES:${PN} += "kubernetes-kubelet1.26 \
kubernetes1.26-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
