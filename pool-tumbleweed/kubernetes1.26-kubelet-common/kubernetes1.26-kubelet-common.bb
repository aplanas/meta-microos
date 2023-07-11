SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-kubelet-common-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "f2563eff07f9adb78b22f14c146d8996b710a065ea4dfa12fead1abaeef5f0ef42054801b410e50795cf2a4447be0b3f36385c42bffb4823bfe261b5df85508a"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.26-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.26"

inherit rpm
