SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-kubelet-common-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "91ee460b521ab3ef18b29d871c5557348983ef4a04fe883ac95a442b123b0cdd0d709ece65c0a179a5b2f43215d089566b58c1dba7e2feca95edcb86ca45d804"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.23-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.23"

inherit rpm
