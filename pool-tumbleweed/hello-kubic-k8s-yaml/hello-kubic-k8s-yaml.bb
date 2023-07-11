SUMMARY = "Kubernetes yaml file to run hello-kubic container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
hello-kubic container in a kubernetes cluster. \
 \
hello-kubic is a mini webserver with a 'Hello Kubic' webpage \
containing some informations about the running pod."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "hello-kubic-k8s-yaml-1.4.1-1.7.noarch.rpm"
RPM_HASH = "1f71491ad8ebdba3ad28401ca8413f16aee4b750a3c90acbc79db1c7be210d340e4bb51e2041418c5f2d5e69c7a4f9201134cc2abefd86f1af909f2e9b1b02da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hello-kubic-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
