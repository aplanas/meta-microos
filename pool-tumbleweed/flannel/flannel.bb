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

RPM_NAME = "flannel-0.14.0-1.10.aarch64.rpm"
RPM_HASH = "f77bc282ab6f420a7e7ab25749b345211bdbb0462b612ac3345cf9bff6f512c848f07c78f7c2e8452b0e4d17621bbf9de7987a9a4ee71cc30eaa691801438098"

RPROVIDES:${PN} += "flannel \
flannel(aarch-64)"

RDEPENDS:${PN} += "iproute2 \
iptables \
net-tools-deprecated"

inherit rpm
