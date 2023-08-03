SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-controller-manager-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "daf14599f47d53ce575d4e5449c2995be63334058ea63bb7824184b3f57e1a6e11ddc966261ee52c2a5dcd617651319123dddbd3e86640362fd3b6f7f190cc26"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.25-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
