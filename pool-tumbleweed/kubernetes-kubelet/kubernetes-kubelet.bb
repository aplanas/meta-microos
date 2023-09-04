SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-kubelet-1.27.4-34.1.aarch64.rpm"
RPM_HASH = "8b0eae110e15db902cb44f47c151c654f7a3b4eddf95d03c15b9324bff5ceef3744c3930ceb4d4256ebde4b19537ff2ccbfabb1e9ed80e39efcb0873b4925f2a"

RPROVIDES:${PN} += "kubernetes-kubelet"

RDEPENDS:${PN} += "kubernetes1.27-kubelet"

inherit rpm
