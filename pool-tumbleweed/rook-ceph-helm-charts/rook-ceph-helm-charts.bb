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

RPM_NAME = "rook-ceph-helm-charts-1.6.2+git0.ge8fd65f08-2.9.noarch.rpm"
RPM_HASH = "3759ade125ad41f5a1261330206a8b64597ba8ca088dd140a38de21b8ffc0517a0643b691f55636bcfa2b6a478688652b06771911d80cea8fdba0d45447f2c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-ceph-helm-charts"

RDEPENDS:${PN} += ""

inherit rpm
