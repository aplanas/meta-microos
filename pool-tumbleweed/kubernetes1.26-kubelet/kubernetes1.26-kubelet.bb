SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-kubelet-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "93d888b15a67d94887c0c8ad6b14f549ae230f0da7e7f05e38cd3bb8d02892762e78455d8001277d05aa06b568325c45248f6145790ec2570c89ccfaa4ebb6b5"

RPROVIDES:${PN} += "kubernetes-kubelet1.26 \
kubernetes1.26-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
