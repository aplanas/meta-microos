SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.23.17"

RPM_NAME = "kubernetes1.23-client-1.23.17-5.1.aarch64.rpm"
RPM_HASH = "ce67daee8e0e3637e59171620415d653232cd96e72bf370b4b129110379f64bac62d86e564396a6aa9f40467caf2f7d0c4b7ee108d86d3d89a1018ab826fbc48"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.23-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
