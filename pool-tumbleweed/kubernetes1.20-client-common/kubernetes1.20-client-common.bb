SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.20.15"

RPM_NAME = "kubernetes1.20-client-common-1.20.15-2.2.aarch64.rpm"
RPM_HASH = "ab68a9bbc9c295b4e99c3a95dbeee99585762cf47f690cd6cb8a44cba1cb8f32e120a9e1692c5e5ce73ea3f546b8d3312233f14de3e6233821b02c9194703ba2"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.20-client-common \
kubernetes1.20-client-common(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
kubernetes1.20-client"

inherit rpm
