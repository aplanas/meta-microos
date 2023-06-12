SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes-scheduler-minus1-1.26.4-30.1.aarch64.rpm"
RPM_HASH = "ed4f34ff27fd5a6151e1f57948abf4ab80161480e8bf6b9b602e88abef741636404d0ffc884e09f9f42c56b96591b7f3885c880b829e15fa4c11343a699c018a"

RPROVIDES:${PN} += "kubernetes-scheduler-minus1 \
kubernetes-scheduler-minus1(aarch-64)"
RDEPENDS:${PN} += "kubernetes1.26-scheduler"

inherit rpm
