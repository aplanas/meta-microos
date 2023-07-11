SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes-kubelet-1.27.3-32.1.aarch64.rpm"
RPM_HASH = "21b739f251430d19bc01d3faf6cd6dd08619a0e52672c37dfe5d57299306442f9d2f15d621ff3cc738969877593925e0fe5a5c0399b330a7fb22b8a745648d95"

RPROVIDES:${PN} += "kubernetes-kubelet"

RDEPENDS:${PN} += "kubernetes1.27-kubelet"

inherit rpm
