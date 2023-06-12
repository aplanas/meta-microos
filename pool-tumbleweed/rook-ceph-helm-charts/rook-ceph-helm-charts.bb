SUMMARY = "Rook Ceph operator helm charts"
DESCRIPTION = "Helm helps manage Kubernetes applications. Helm Charts define, \
install, and upgrade Kubernetes applications. Rook is a \
cloud-native storage orchestrator for Kubernetes, providing \
the platform, framework, and support for a diverse set of storage \
solutions to integrate with cloud-native environments. \
 \
This package contains Helm Charts for Rook."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-ceph-helm-charts-1.6.2+git0.ge8fd65f08-2.8.noarch.rpm"
RPM_HASH = "3b595d53d39816fd99017fd146ba6fe0e573f7a2f83dd16a2f0084ffef1dd1ff17379686c88b2a74a57751b2df6d107e57f1838c024172d6c491a89541b8f8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-ceph-helm-charts"
RDEPENDS:${PN} += ""

inherit rpm
