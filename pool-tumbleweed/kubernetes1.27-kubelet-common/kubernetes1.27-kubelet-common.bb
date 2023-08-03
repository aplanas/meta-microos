SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-kubelet-common-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "20a4cdd79b20beb8cd5bda6e72ff138f213248d2375c9587d30ad2ffd077adcaa7bf88a30ce361dc027c956ea49b83af47e5cbe381a494530f4cd6b607da3ff1"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.27-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.27"

inherit rpm
