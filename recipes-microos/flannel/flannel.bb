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

RPM_NAME = "flannel-0.14.0-1.9.aarch64.rpm"
RPM_HASH = "beae1de8163c0165fd476f4b3767248741d46a05b0c6669be21ca2cb4404f08fa72b8e2ce8737dfcaa796b8108da002602d2da3f6905f2a116b4d1bb4704cc62"

RPROVIDES:${PN} += "flannel flannel(aarch-64)"
RDEPENDS:${PN} += "iproute2 iptables net-tools-deprecated"

inherit rpm
