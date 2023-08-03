SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-proxy-1.27.4-33.1.aarch64.rpm"
RPM_HASH = "ffc47c1b418fedc387be74dec746956c8de759f74a73a75c9ac7c93ea3b93115c70cecbccc2ad3af17341b43e67a3f1f26d5440ad576bd296dd7f5e5d4825de8"

RPROVIDES:${PN} += "kubernetes-proxy"

RDEPENDS:${PN} += "kubernetes1.27-proxy"

inherit rpm
