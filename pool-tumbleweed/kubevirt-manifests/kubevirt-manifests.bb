SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-manifests-1.0.0-6.1.aarch64.rpm"
RPM_HASH = "4ed92e8a4223e8c47f523c8719a30778031343781c0f705f5b640a7399784ab46dc81522858a3f480387bad0e52efb6fdac79e00b7ed7fbb302727a27c6ad6f3"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
