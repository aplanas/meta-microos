SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-scheduler-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "d85c9e04efea304427c117879ab037b494f17ede7bfd9c45e1e32a49993881dbde4cb5cbf15a5aae92b16c77fb8145e116dc92f0ea390f91f9e74fe035795824"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.22-scheduler \
kubernetes1.22-scheduler(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
