SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-scheduler-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "996a0babbb6b2e0509804fded58bba55ec486770a3682ecc5f7f91d9cde258d6ece5dd950dfb34d93957329b06ba5499f960fac0069b845c0a081b07ada56110"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.26-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
