SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.26.4"

RPM_NAME = "kubernetes1.26-client-1.26.4-1.2.aarch64.rpm"
RPM_HASH = "6fc703c1e396a11fc21fc7ffb1201c6bdcc8e2d6332297e8639c76d568d9648ca5d09081805845ea3af6297ff4c1f9fdf3fd62d3922c420119368a1c00ef9efa"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.26-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
