SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.22.17"

RPM_NAME = "kubernetes1.22-client-1.22.17-2.2.aarch64.rpm"
RPM_HASH = "eacf07e85e24ea446f81858af28edb88ba790a03db8dfecb0d37fe29c5ad0f0c8e1c6841cc4292ca93bded74a9a4067e6487d6cdcf434c026ac76c5c4e23a402"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.22-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
