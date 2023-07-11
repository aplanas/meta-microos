SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes1.26-client-1.26.6-1.1.aarch64.rpm"
RPM_HASH = "6ba626892d6cacf8ce3e95f6fa19487ea73e39857ecfad8a4230bf726d47e8f47cc617de49d909221b569dee04e98af6b8ebb66f7b69243de90c3d741550cea5"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.26-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
