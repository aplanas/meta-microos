SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-kubelet-common-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "814f83b8274d5c83963b0f67a71b9e785f4553e08307e0b53f6127cd4fc2e04f6a1ad2817da0d26c77d213bee4f6d6acf0c61d15f5bc2fd69fdad55061ded7fb"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.24-kubelet-common"

RDEPENDS:${PN} += "/bin/sh \
cri-runtime \
kubernetes-kubelet1.24"

inherit rpm
