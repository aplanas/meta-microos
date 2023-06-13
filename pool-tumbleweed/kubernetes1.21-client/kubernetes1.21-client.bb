SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.21.14"

RPM_NAME = "kubernetes1.21-client-1.21.14-2.2.aarch64.rpm"
RPM_HASH = "73294a5dc845014288cba640bfb7c98773fdebda9110671f39404e1bff32a0e544c0d6ccde300901aee6cd6a3db3782b7af48b82a7d8272c41b79c2210916905"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.21-client \
kubernetes1.21-client(aarch-64)"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
