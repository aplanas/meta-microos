SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-scheduler-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "7a68737f97b2473c538bf52a0b5e18ba1810f4a40d94c59f67d59bff1b94407005703431ffaa7370f64e857585a7e965db293f774117d339264e4cc254752c22"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.25-scheduler \
kubernetes1.25-scheduler(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
