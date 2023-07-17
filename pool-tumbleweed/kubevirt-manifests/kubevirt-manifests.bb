SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "0.59.2"

RPM_NAME = "kubevirt-manifests-0.59.2-2.1.aarch64.rpm"
RPM_HASH = "2c57caf773c197bfad5f26e8b6bac9dcdbbea5d4e9bb9ec318831f2f408d1ecb25c73cb5075e9c50bded7430892893d37113e1f1d344e51d4587321d03ff00da"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
