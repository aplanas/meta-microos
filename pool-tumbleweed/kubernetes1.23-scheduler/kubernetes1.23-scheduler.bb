SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-scheduler-1.23.17-3.1.aarch64.rpm"
RPM_HASH = "267c85e28812337a4918be6329ea04bdce8a92e4157e741543371ce38ebfe5082e0a7ee3b3d517be7c2d688425e57c838c5f1d1edb9a049a98f52ac17fce8387"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.23-scheduler \
kubernetes1.23-scheduler(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
