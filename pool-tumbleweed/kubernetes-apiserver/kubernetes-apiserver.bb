SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-apiserver-1.27.4-33.1.aarch64.rpm"
RPM_HASH = "0946ceb2205c5db8465356b8abb766b1c87b3d8a6002b20999b1f11c548b00b507891b0d0f74b9a5ed986214f922ac491147a552d5793522e59193f745727fcc"

RPROVIDES:${PN} += "kubernetes-apiserver"

RDEPENDS:${PN} += "kubernetes1.27-apiserver"

inherit rpm
