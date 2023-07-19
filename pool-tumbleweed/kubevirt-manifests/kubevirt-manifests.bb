SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-manifests-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "58beecd573e597168b903a8d977311380405094c46298dd9f68c4f63d52f11b987ac6f28b4cd62db79309c4a7beb8626fce1bdf9a03b0731d3ce7b2e8d860188"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
