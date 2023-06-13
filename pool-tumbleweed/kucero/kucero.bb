SUMMARY = "Kubernetes control plane certificate auto rotation"
DESCRIPTION = "A Kubernetes daemonset to perform automatic control plane certificate rotation."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "kucero-1.6.2-1.3.aarch64.rpm"
RPM_HASH = "9b87d08457466fed91c171a525b9a211b4ae3aeec4f6dda9815fc0310499e89dc51a16280216fc4c1e39e208a4f5d32272a9f4c0f5c9b18b053edb22791ceab0"

RPROVIDES:${PN} += "kucero \
kucero(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
