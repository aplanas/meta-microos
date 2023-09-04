SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-controller-manager-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "4885232dd2bb903ccb54c78cd2ccd081a0991b5f338a3ea45fd77f68fcaa577444af308c4652b867e27f8d3cb25154bed6a11de3d4cefb511095f17b04c08931"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.27-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
