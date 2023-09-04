SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-apiserver-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "04eaaf0197a9a55353c7a6d3195b09e30040288d73d3182dc196feb933fd6a382120a6f9ca67cd71b1db1416ff56544f7e48f4682f26a6490d36bba3cfb4871e"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.26-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
