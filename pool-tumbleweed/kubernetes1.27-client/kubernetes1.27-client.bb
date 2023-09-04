SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes1.27-client-1.27.4-2.1.aarch64.rpm"
RPM_HASH = "1ff42d49b8fda231ef4dd0f2b15dd5718bce08cfa696fe1ef98d79e0c938e6b71be0e462cd546d7b3863b2176a1bb0d9be94d46888d79524609eb5289a615a54"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.27-client"

RDEPENDS:${PN} += "kubernetes1.27-client-common \
update-alternatives"

inherit rpm
