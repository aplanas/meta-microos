SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-kubelet-common-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "0b42874b4034be07013c0517e40d75b67f719d83066fd0c2795ec7a43f0a1904c9b2375f756f3ffa8c23f7803eb1461387a22f6c35b2869860abaf722fd93696"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.22-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.22"

inherit rpm
