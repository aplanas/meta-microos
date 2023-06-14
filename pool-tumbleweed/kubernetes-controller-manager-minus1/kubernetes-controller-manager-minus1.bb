SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes-controller-manager-minus1-1.26.4-30.1.aarch64.rpm"
RPM_HASH = "582079215918173662426e308374718b76d053a818c132e9d5cf38deeeeccc89343d0ef648e5bce689f2772002491d1d8987386605d5aab18ded9454e2ab18db"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus1"

RDEPENDS:${PN} += "kubernetes1.26-controller-manager"

inherit rpm
