SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubelet-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "018c36b5229709669fb39b833d810971a02604ba996d63b439a99fa362d616152a57099547c70cb430d070059207f3f2d3bb9898dd181a3f91acb0e2f0f9723f"

RPROVIDES:${PN} += "kubernetes-kubelet1.21 \
kubernetes1.21-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
