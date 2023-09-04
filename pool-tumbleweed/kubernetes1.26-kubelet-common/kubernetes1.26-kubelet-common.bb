SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-kubelet-common-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "57b02774ff4c1b0a5bc348a6d8195e5190dea10b016ec8260d0cf26ff8acedbff25444604115ad90ed1d4b72a5b15e679950fcdc93d1efa093e831cf3080bf96"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.26-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.26"

inherit rpm
