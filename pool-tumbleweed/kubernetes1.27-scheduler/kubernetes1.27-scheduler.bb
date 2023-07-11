SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-scheduler-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "2881b9446ea10ddc0ffafcbbcc6de1386f1c2242932483b9b10ee6ae80df4a501e028d249d5ecd3f5b0b6af2cb4d266a1ab176ad8a108f1035d2556dce623903"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.27-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
