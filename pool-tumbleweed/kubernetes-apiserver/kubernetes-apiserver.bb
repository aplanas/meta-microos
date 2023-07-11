SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes-apiserver-1.27.3-32.1.aarch64.rpm"
RPM_HASH = "425df4590bc9c11f00d9ea0df48c396da0bbb424210d532b62e4c247025428bd1665bd89c71920c62032255d879746b211095e7bf676c69264706fcf575c1fef"

RPROVIDES:${PN} += "kubernetes-apiserver"

RDEPENDS:${PN} += "kubernetes1.27-apiserver"

inherit rpm
