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

RPM_NAME = "flannel-k8s-yaml-0.14.0-1.10.noarch.rpm"
RPM_HASH = "202e3024c88269c8ab3227df7c2dc4ef65e0a53c5837a9777e22344272c29b6ca76c71c49bdb0e94b2178e2d0620d93bb2c92d04517b75068869007b74dc97ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flannel-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
