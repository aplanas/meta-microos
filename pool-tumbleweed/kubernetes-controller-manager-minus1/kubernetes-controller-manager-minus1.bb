SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-controller-manager-minus1-1.26.7-33.1.aarch64.rpm"
RPM_HASH = "ce7a3b7253bd8daa008aeaf81915a79f19a5d336cd8ae9c3bfd348b0228ac1c23924ea5caa1343171cee0882ca350d37cd8d231620f292137b49ee75cfecd2a8"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus1"

RDEPENDS:${PN} += "kubernetes1.26-controller-manager"

inherit rpm
