SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-apiserver-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "a40f3f64a234b745ee7381017add37e8c9e1e92ddac3acc6fd313e25ad3fdd2dfaad4d11d290007826f9346e4a53e655d674094110c3d7824991c97cb919c84e"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.26-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
