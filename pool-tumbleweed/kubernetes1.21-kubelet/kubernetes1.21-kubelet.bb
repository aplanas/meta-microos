SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-kubelet-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "d124ef45e3390b79869edb240e78ab8991554700f0dcea8a5b508281f444ee593ac9bf75f50055a4b7b097feef2ffb8a1449dbf944beebd2689ab74645cbe437"

RPROVIDES:${PN} += "kubernetes-kubelet1.21 \
kubernetes1.21-kubelet \
kubernetes1.21-kubelet(aarch-64)"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6()(64bit) \
systemd"

inherit rpm
