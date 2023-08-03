SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-scheduler-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "3a9471b7826887e56d77b722f66f9f2371196117ebd5e3c1f9561fd5ca1444654c847923e2ef1d7f690694453520643f78a50f8da09902db5a020677ebb196e8"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.25-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
