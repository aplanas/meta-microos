SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubelet-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "b3a98e2363559022339ad3f6091873778252163f9a33cd82218ce32a68db094b0343b43a3108b28cbebaf786c944e52ed83d2aa5505074f66edef49b651f274e"

RPROVIDES:${PN} += "kubernetes-kubelet1.22 \
kubernetes1.22-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
