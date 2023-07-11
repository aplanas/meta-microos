SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.25.11"

RPM_NAME = "kubernetes1.25-client-1.25.11-1.1.aarch64.rpm"
RPM_HASH = "fc8b508f951d5103e9125fedda34c5261a1d8d06336d8e800eb4a55e4a6f0bc7a7154ea1be51fe99363d04b9c2654972001e7fbdd008878d115fd235aa6721fa"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.25-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
