SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-scheduler-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "088cb3cdcb5720285ab0414a69d06f90d99ff50ed40670616fded8e9aaf8251a1d43d0a4b57ebc5660c85128d44d129a2bd98914f82a2e75468527fdd71fa68a"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.27-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
