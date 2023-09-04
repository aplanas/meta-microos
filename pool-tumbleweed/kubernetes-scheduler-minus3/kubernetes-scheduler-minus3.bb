SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes-scheduler-minus3-1.24.16-34.1.aarch64.rpm"
RPM_HASH = "5cd219c769f95c327deba933b5777fd45facdb721374a9389826d80a80abdfa51649312406b1c01e4af6e5af32d28d03d24001b6a53097f0c12f8e7b9730c601"

RPROVIDES:${PN} += "kubernetes-scheduler-minus3"

RDEPENDS:${PN} += "kubernetes1.24-scheduler"

inherit rpm
