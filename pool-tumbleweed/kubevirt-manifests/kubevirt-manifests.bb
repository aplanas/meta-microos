SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-manifests-0.59.2-1.1.aarch64.rpm"
RPM_HASH = "03a9fc74512de947138d38891573d63902aae8b6fbc22b643efcac8ba702ca4ad8850638abf1e6f6ad96262ff9e6788454a08a312d65e2a0c2aa2c247b2bc781"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
