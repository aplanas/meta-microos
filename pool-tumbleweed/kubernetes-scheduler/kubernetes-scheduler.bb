SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes-scheduler-1.27.3-32.1.aarch64.rpm"
RPM_HASH = "5bf76652212925f5f099699fadd4879df3b663d74d98d160c929bce59d217ee4b7cbb19b422b03e169c4a1887f8cc85103c86200cbd9b5ce08448d3a4058aeb6"

RPROVIDES:${PN} += "kubernetes-scheduler"

RDEPENDS:${PN} += "kubernetes1.27-scheduler"

inherit rpm
