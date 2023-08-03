SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-scheduler-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "4d91b1dbae62bd06601f1311993544757ad67f76d0afb4e5a25a8e90ce7ff48e5dcb02ab06ebc87290bc72d85e2e8807e63a3f5602345aad47e2530a7722277f"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.26-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
