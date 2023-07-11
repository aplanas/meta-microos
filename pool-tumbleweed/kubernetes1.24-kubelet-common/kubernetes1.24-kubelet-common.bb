SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-kubelet-common-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "458168b29246aa71ead540c9503af067ec8a8dbab6d48d5837ca298dc17116c37cfa930eb527181109a5d9a914565423421e26cf98b878776ca56f67326708c4"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.24-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.24"

inherit rpm
