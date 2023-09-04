SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-scheduler-minus1-1.26.7-34.1.aarch64.rpm"
RPM_HASH = "58017f7235eb21607ec98ff94b8b614f2653a9ccb11d9d27b428bcb4bda26999a7180e74b4743d20ba167df737edbc3637b21439c9df01c73c609a65ef8ad6e8"

RPROVIDES:${PN} += "kubernetes-scheduler-minus1"

RDEPENDS:${PN} += "kubernetes1.26-scheduler"

inherit rpm
