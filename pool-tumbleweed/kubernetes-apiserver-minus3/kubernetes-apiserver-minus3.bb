SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes-apiserver-minus3-1.24.16-34.1.aarch64.rpm"
RPM_HASH = "26d8573efca306fc24af205c5a9e332a8e3721ca4b7d119e665a003728c0eeb60843eee2d3fadf329b01304a7a5bb73e90af9f7f226e43a570353d20cd4ef58f"

RPROVIDES:${PN} += "kubernetes-apiserver-minus3"

RDEPENDS:${PN} += "kubernetes1.24-apiserver"

inherit rpm
