SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-scheduler-1.22.17-2.3.aarch64.rpm"
RPM_HASH = "0190163107911a691035c23afbc354745645dcdb6a0949063c317bbad2ea215577e716963ad424edae3c5865af59a653bde151f12a34d7a8ed28a9649b8a7e41"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.22-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
