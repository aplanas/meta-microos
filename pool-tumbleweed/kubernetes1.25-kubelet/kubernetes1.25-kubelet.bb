SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-kubelet-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "aff7bf93e2097b2ad557ebf7361d4aab414fe4113a7f9983d7b53047f8d159a984d79b07ecdabe6186da6cab68fe4fb18bb22627484f9bd38a8ce07ffa38e093"

RPROVIDES:${PN} += "kubernetes-kubelet1.25 \
kubernetes1.25-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
