SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-manifests-1.0.0-3.1.aarch64.rpm"
RPM_HASH = "9927f21925c113c94a0984a5b9809dd40fb59497ac8e5941cbd3df79c241786c417863d6bdabb82d9938b12750331a7b774d60999055eb4dd93f3b5c740ba8ef"

RPROVIDES:${PN} += "kubevirt-manifests"

RDEPENDS:${PN} += ""

inherit rpm
