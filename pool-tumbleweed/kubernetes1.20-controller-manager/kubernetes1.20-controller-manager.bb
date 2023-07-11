SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-controller-manager-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "675b74fbe59f117241ece2b34fc222c470a791176d03e89adb49c92c1212fa4233399e31f7f57da69e6b2354441d3397deb06e8db639b7a4b79bf5b645aea687"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.20-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
