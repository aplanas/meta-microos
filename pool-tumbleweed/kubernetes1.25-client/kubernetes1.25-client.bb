SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "544ec8a8001a90953170a3392f6f90967ca0f21e79c414e857e0373d9d55de9319ded8b13331667e8026a11e340c33f68836942954f7923a9d8d5d47e0e9665e"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.25-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
