SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-1.21.14-2.3.aarch64.rpm"
RPM_HASH = "016c247527ce54a10de39e81fff00a7db6d16f4836909883e61f1fa1cae38689672e716e91904c48eb91e9040e8fb2d0ba7efc7b512f43b652daa815510ab357"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.21-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
