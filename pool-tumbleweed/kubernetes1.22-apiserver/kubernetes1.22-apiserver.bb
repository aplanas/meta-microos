SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-apiserver-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "e8e828fc9027278bba89e1aadd49bce957f2729b4a68fd53ff0aff426a7b3986baf5eed149c5fbc8a2cdb16fcb344c9436d6cb770aed932d7bef943cc98ca914"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.22-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
