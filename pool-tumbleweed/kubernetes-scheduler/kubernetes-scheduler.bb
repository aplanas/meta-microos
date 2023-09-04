SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-scheduler-1.27.4-34.1.aarch64.rpm"
RPM_HASH = "bd636a081df00fce2b28a4bb91bf9b3c3d1b633d604a14acb919f3df7c28e41e641584ca21c643f76bde31cc407c39c1ca9ae4562b5f7bd49076d1013e93c2b9"

RPROVIDES:${PN} += "kubernetes-scheduler"

RDEPENDS:${PN} += "kubernetes1.27-scheduler"

inherit rpm
