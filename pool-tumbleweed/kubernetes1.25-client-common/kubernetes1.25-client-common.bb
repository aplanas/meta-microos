SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.25.9"

RPM_NAME = "kubernetes1.25-client-common-1.25.9-1.2.aarch64.rpm"
RPM_HASH = "d6ffe7860c744225b77eff84eda23908908683568114b632d291d08f1cf94719e9b8eb1ab315e61db0893e51ed4335ed4f5e2c509ac377dab573a1c3166575e7"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.25-client-common \
kubernetes1.25-client-common(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
kubernetes1.25-client"

inherit rpm
