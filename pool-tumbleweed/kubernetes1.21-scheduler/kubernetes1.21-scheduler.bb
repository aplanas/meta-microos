SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-scheduler-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "8dede7b762317db987a5d9423f6dfcb59b8fe8ad3a87f42f8589a234a271ee3933a4d0e8f3390617bb0aa0b6846a81ef4746d62d93085d74935e4528309a0789"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.21-scheduler \
kubernetes1.21-scheduler(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
