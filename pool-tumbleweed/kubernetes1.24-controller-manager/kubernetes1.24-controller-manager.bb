SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.13"

RPM_NAME = "kubernetes1.24-controller-manager-1.24.13-2.2.aarch64.rpm"
RPM_HASH = "fb1f9064f80c3b04bddc8198f3a778a629c912e8b41b78846be8959c9500cb95edc7fe3cfe9a72b7b3575094f22cd582841803df0736b3df0cc37738575d6aaf"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.24-controller-manager \
kubernetes1.24-controller-manager(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
