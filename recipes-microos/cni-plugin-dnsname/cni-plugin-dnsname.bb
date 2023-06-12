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

RPM_NAME = "cni-plugin-dnsname-1.3.1-1.9.aarch64.rpm"
RPM_HASH = "f2f8ae6e3cf8eef5830dd67545aa21885a12b4018f73c910da44a19be61b735f55558aede38ea6a4fee251daf5f5b92f269394656fb56c8781ee522144f98336"

RPROVIDES:${PN} += "cni-plugin-dnsname cni-plugin-dnsname(aarch-64)"
RDEPENDS:${PN} += "cni dnsmasq libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
