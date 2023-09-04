SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes-proxy-minus3-1.24.16-34.1.aarch64.rpm"
RPM_HASH = "99198cfd805c7c4fe391d7bf57497f2fec6ea7fa4beb7edb4b85462e8064afb1a81ee7d0ce6bfa587e2ba6b124799c727d826404d5b43777e1baa01ed754c5c4"

RPROVIDES:${PN} += "kubernetes-proxy-minus3"

RDEPENDS:${PN} += "kubernetes1.24-proxy"

inherit rpm
