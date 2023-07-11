SUMMARY = "Kubernetes yaml file to run MetalLB container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
MetalLB container in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "metallb-k8s-yaml-0.9.5-1.14.noarch.rpm"
RPM_HASH = "14894299d8170a2d9878c74c6024b92dce1956d0200ca27eceecb2626b65eac8f24589a3d4b52bae56d06b96241f4bd09d0f46da8de310957beaa2ba28d24f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metallb-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
