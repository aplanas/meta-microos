SUMMARY = "Kubernetes yaml file to run flannel container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
flannel container in a kubernetes cluster. \
 \
flannel is a virtual network that gives a subnet to each host for use with \
container runtimes. \
 \
Platforms like Google's Kubernetes assume that each container (pod) has a \
unique, routable IP address inside the cluster. The advantage of this model is that it \
reduces the complexity of doing port mapping."
LICENSE = "Apache-2.0"

PV = "0.14.0"

RPM_NAME = "flannel-k8s-yaml-0.14.0-1.9.noarch.rpm"
RPM_HASH = "c0f30669225b16e3a8aff466bc81c7892b48e340ece62f89ee65db425d42fe1252f44a98432362cc0c5ff35963eedddb67317057ae268a2f50e68eb4588736f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flannel-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
