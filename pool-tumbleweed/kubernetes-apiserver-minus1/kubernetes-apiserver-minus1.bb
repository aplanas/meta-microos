SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes-apiserver-minus1-1.26.4-30.1.aarch64.rpm"
RPM_HASH = "4132609ba39a6dac9a5e35fa49b60f89fb57c25aa43e7c45bf11ccc22c9e14412ce5fc38567d1ea33c318a89aaff44ca59e9f845418baa2753f5df85eaa2ec14"

RPROVIDES:${PN} += "kubernetes-apiserver-minus1"

RDEPENDS:${PN} += "kubernetes1.26-apiserver"

inherit rpm
