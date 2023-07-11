SUMMARY = "Kubernetes yaml file to run Multus containers"
DESCRIPTION = "Multus is a CNI plugin which provides multiple network interfaces in \
containers. It allows to use many CNI plugins at the same time and supports all \
plugins which implement the CNI specification. \
 \
This package contains the yaml file requried to download and run Multus \
containers in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "multus-k8s-yaml-3.6-1.10.noarch.rpm"
RPM_HASH = "9fd7dbefe92a51ec099e3f5425b3e4b3719244b669c76b86e6e219fb1c6edac058030c3fcb225a41bb23f66fd8e31c02a551691a8c6d72e97fac49b9d4b8b3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multus-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
