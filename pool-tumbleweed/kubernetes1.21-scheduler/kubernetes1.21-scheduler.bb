SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-scheduler-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "1f27189510ac7e3b2112eef285cc5540377e5bf2217d54e4da67252099e43b2b808a65fcba8656e752a3a059690b735b52d405527c54a6f389aa394977f5da90"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.21-scheduler"

RDEPENDS:${PN} += ""

inherit rpm
