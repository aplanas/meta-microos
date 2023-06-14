SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-manifests-0.59.0-3.2.aarch64.rpm"
RPM_HASH = "d968f4daacebbbe53452c6ab551fc62135887f55b9d88743f5bbbf1e45d9181f88cb17b294c2edab52a62ccbaf5178e73bc7f02ef14de2a75a0265ad15d4827b"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
