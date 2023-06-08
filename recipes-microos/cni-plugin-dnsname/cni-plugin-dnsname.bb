SUMMARY = "CNI plugin to provide name resolution for containers"
DESCRIPTION = "This CNI plugin sets up the use of dnsmasq on a given CNI network so that Pods \
can resolve each other by name. When configured, the pod and its IP address are \
added to a network specific hosts file that dnsmasq reads in. Similarly, when a \
pod is removed from the network, it will remove the entry from the hosts file. \
Each CNI network will have its own dnsmasq instance. \
 \
The dnsname plugin was specifically designed for the Podman container engine."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "cni-plugin-dnsname-1.3.1-1.8.aarch64.rpm"
RPM_HASH = "5ad1e79d567ff0f8dfc7518bdd23bac7c281289034123aaf30d872f490b399354ac384a14f28288491ca440bbfe0465e4a8c6194c0153eba4a0b7f81c7815021"

RPROVIDES:${PN} += "cni-plugin-dnsname cni-plugin-dnsname(aarch-64)"
RDEPENDS:${PN} += "cni dnsmasq libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
