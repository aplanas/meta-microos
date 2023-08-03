SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-scheduler-1.27.4-33.1.aarch64.rpm"
RPM_HASH = "eb1581543739fab5005321828ebf94ce10e04b86ef0aab5f876d1ccad3bd17e192805f6c3e1e4153c5fd02207749e45fc172098d5aed29b0711482d8a14ed6e4"

RPROVIDES:${PN} += "kubernetes-scheduler"

RDEPENDS:${PN} += "kubernetes1.27-scheduler"

inherit rpm
