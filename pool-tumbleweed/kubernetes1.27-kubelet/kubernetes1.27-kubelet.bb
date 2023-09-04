SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-kubelet-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "a9a5182b967920c536abf1f556d8914fc34f794049997ad4cb5073e703b5315d066c4e49ce5a471041fffe9be2466fb73b7e12f792623f714972330b3d36054c"

RPROVIDES:${PN} += "kubernetes-kubelet1.27 \
kubernetes1.27-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
