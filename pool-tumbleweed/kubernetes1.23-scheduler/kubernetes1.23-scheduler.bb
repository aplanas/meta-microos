SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-scheduler-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "833707cfd7edde0cf7669f8b75e16487e1a2247cbdad1b3b5f71ede08a393bac470c7633cb1b7c7aac51c26ac76f4aef3975bf53371cbd2cda00d2800375b3ad"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.23-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
