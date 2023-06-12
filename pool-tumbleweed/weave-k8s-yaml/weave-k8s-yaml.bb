SUMMARY = "Kubernetes yaml file to run weave container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
weave container in a kubernetes cluster. \
 \
weave is a virtual network that gives a subnet to each host for use with \
container runtimes."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "weave-k8s-yaml-2.8.1-3.8.noarch.rpm"
RPM_HASH = "829435763e706d481664d6b31a6b005716b5bdf360f057e5dca91ea058177bd97b4447e0cad36210b1b74fa0fa2b1bd74ca3104a69cb6b507329d4650d9b7794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
