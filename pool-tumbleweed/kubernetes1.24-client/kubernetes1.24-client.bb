SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-client-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "6ee3eb15b53e19f5efaddff8e518c9ad3360f9766bfe49e2491a90c8292ffa6328cad9e46119369d07bbd2188c07a243dbe6b2ca1cf5b5b9c2d23f6fe58d4a95"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.24-client"

RDEPENDS:${PN} += "kubernetes1.24-client-common \
update-alternatives"

inherit rpm
