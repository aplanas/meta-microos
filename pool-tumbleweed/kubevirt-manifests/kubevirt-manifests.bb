SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-manifests-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "30143d2814db30f4d66d418a72e57314692adbf6f807c1182c6dfbbeb74f5222ef234fb7a8d29e7dc53423f33d76eeac276db60531aae9a6ebbc5b2e7085246d"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
