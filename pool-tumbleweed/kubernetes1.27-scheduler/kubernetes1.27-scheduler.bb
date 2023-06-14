SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-scheduler-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "a251ac14433e680a075bb6b60d7747548368f8687f080ba178ab341a0bf353ea575f5e7094e0f5b03fc5b6440057b621203926757b8febd9d24d566fd71911ba"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.27-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
