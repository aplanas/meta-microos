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

RPM_NAME = "flannel-k8s-yaml-0.14.0-1.11.noarch.rpm"
RPM_HASH = "98cec509482c9be72660dc3b3669087579c06478cea9d9da34339b470ecfdd762385f11b38614e308833b93e324f2104b18917c3e6200c389635eacd3f42053f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flannel-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
