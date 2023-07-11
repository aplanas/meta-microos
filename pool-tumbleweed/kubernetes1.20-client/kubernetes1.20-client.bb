SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-1.20.15-2.3.aarch64.rpm"
RPM_HASH = "bae39fed4141a4b9dfc249e3ec537ffc2a8c8c8d69059d73153c6d3dc84cf191b46d0e901c82fa83c8960f5b6d1a897ac2d1e3309115516084f6f1b8242a8b4c"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.20-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
