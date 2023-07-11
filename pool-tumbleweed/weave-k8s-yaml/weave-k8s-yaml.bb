SUMMARY = "Kubernetes yaml file to run weave container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
weave container in a kubernetes cluster. \
 \
weave is a virtual network that gives a subnet to each host for use with \
container runtimes."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "weave-k8s-yaml-2.8.1-3.9.noarch.rpm"
RPM_HASH = "38ede7abee1f547c5a24c851429eb1fe0a81aacc7c995fbb906cfa82917270b93c97066909d081f1f9861a1d40e7ffeda80dfd675b9beea1e3b999a6038faa6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
