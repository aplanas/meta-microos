SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-scheduler-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "c02db2ba3aabd23673bd82d52922d32849bebe96863dd73c17b8baf989c751d86fc2c20eed33a40da9d227edd3abad8b7c9b1e6ea23fef64adbb83ea241f0350"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.27-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
