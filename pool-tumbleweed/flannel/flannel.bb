SUMMARY = "An etcd backed network fabric for containers"
DESCRIPTION = "flannel is a virtual network that gives a subnet to each host for use with \
container runtimes. \
 \
Platforms like Google's Kubernetes assume that each container (pod) has a \
unique, routable IP address inside the cluster. The advantage of this model is that it \
reduces the complexity of doing port mapping. \
 \
This package contains the binary to be included into a container image"
LICENSE = "Apache-2.0"

PV = "0.14.0"

RPM_NAME = "flannel-0.14.0-1.11.aarch64.rpm"
RPM_HASH = "d417cfa8ab0ab15c97e5169d558c4218ef171dab2207161f7a975fec9d9f16067f3bea4d33900c5f80077fa96af2a43842d01c49ffa691c5bdff0cff1413adef"

RPROVIDES:${PN} += "flannel"

RDEPENDS:${PN} += "iproute2 \
iptables \
net-tools-deprecated"

inherit rpm
