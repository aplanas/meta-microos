SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-scheduler-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "b753ee8214f71144f0258874dae78e2a65f2bc563a7bea4da235bb5cd8a7ee98f42bbaceea7af48829aeef4f291e4d739a367f922a9db67ecea4e4bdbc56405c"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.26-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
