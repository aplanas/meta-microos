SUMMARY = "Kubernetes yaml file to run hello-kubic container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
hello-kubic container in a kubernetes cluster. \
 \
hello-kubic is a mini webserver with a 'Hello Kubic' webpage \
containing some informations about the running pod."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "hello-kubic-k8s-yaml-1.4.1-1.6.noarch.rpm"
RPM_HASH = "58cdd4c5b7767341ea1b8c6c472faa8ec3dcd29c9669911450e7e2689169b69013b6128afbb8c0b07f790532b81228e3d02b93df2111b42d1ddf71316762596f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hello-kubic-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
