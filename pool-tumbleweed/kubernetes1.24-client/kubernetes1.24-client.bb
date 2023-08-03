SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.24.16"

RPM_NAME = "kubernetes1.24-client-1.24.16-1.1.aarch64.rpm"
RPM_HASH = "37e489bd01be386425cc0a8ee84cab75988a5378be7e6d9596fb64e1650d9123af191375948afd46c994c16c4417a1dd67b91c9c11508d5f927157129bd128ee"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.24-client"

RDEPENDS:${PN} += "kubernetes1.24-client-common \
update-alternatives"

inherit rpm
