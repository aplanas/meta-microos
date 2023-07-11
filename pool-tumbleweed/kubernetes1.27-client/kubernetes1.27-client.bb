SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes1.27-client-1.27.3-1.1.aarch64.rpm"
RPM_HASH = "c6cf125c751322fd0b7d7b3f612d47cde6bb902e08a6c4b6dd3555c2830e38c52b2d3ff868e8ae7f669f9c6f2b4c6cc3638ea1cd8f7a6086355400b0cb9cbdc2"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.27-client"

RDEPENDS:${PN} += "kubernetes1.27-client-common \
update-alternatives"

inherit rpm
