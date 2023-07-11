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

RPM_NAME = "cni-plugin-dnsname-1.3.1-1.10.aarch64.rpm"
RPM_HASH = "9e26decb81bd4b499f58d4bb2f9b8ee8e1f78f7c83d4e8d41e5319dbfb17506138ff29e65f1422b226b787661e8b099b7cedc6213acbfa394ced543eb0653568"

RPROVIDES:${PN} += "cni-plugin-dnsname"

RDEPENDS:${PN} += "cni \
dnsmasq \
libc.so.6"

inherit rpm
