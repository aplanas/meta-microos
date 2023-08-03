SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-1.26.7-1.1.aarch64.rpm"
RPM_HASH = "46d52aa3ab42e3d5bc259e24d83370224f4106c8241d7afbe1b057aa7bb7d6939c47cf703191cd6ff30949628018636f556c28779d0bd85b49906027b816a82d"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.26-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
