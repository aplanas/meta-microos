SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.4"

RPM_NAME = "kubernetes-client-1.27.4-34.1.aarch64.rpm"
RPM_HASH = "4c3678632477aab6aa166ae103f498b4316b43bfb5f195e8047f0727800995c7070fee26af5c8a9818aabae49acbbe336cbd2e1793cc490b3da729b306da30d4"

RPROVIDES:${PN} += "kubernetes-client"

RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
