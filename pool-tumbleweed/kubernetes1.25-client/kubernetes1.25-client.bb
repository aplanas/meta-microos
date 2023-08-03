SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.25.12"

RPM_NAME = "kubernetes1.25-client-1.25.12-1.1.aarch64.rpm"
RPM_HASH = "c9d46f29b5b725b2afbbc1abeee9048460f45b93dc6d21f85a0e1bdd9adbe54b0a00d345e091c6977613b21d59ce9b0a6582f66bdf8deb86a57d0902f9b2577a"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.25-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
