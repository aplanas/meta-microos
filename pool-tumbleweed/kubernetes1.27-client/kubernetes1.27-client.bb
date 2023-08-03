SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-1.27.4-1.1.aarch64.rpm"
RPM_HASH = "da0c4ee3193c1e0f044d57bd7c5b0fb08446befa7f2ae4fdb64146fb1e827d3a1bdddfad288338cb0e25049cf989e5cd0436f2b6fa548dc67c8cd4fce7355925"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.27-client"

RDEPENDS:${PN} += "kubernetes1.27-client-common \
update-alternatives"

inherit rpm
