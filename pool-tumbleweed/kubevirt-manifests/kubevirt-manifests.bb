SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-manifests-1.0.0-7.1.aarch64.rpm"
RPM_HASH = "da7ae2ec3f5db6edf0b832db6c1da4bfb732123ba0453c3da60e7d5d8022add992f0c5ffaca8c88121faf9dd6be11b14338ab9308a268943bf7b601a99df9797"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
