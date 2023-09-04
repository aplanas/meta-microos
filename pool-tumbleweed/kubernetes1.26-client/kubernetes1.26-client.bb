SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes1.26-client-1.26.7-2.1.aarch64.rpm"
RPM_HASH = "7c86a8cc4109347c5de24b58cdc94074e3e45d0f735a0879da1d8ab64de7512e82508d0b4bf9e9816d03a3471b59a7e050509267887baeece30d5c6a33724b7d"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.26-client"

RDEPENDS:${PN} += "kubernetes-client-common \
update-alternatives"

inherit rpm
