SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-apiserver-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "6184ac64e73277408345c281f18155eb2123c4db60fbe73894c98daf870847b11352a9da2a4368f86fa4720d8d9135603870c34ef1789779b386e58510b479db"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.26-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
