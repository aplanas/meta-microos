SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-controller-manager-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "b00c772eeadec0f0437e09691c4d096e1053f2507e0feb3fb0f1b5584bd693cb0e3b2f64abb3fc53518bc1c38f556da575b153d8ab98d8840b521d6e6554b43a"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.26-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
