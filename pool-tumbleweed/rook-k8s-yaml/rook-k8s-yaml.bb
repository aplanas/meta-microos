SUMMARY = "Kubernetes YAML file manifests for deploying a Ceph cluster"
DESCRIPTION = "This package contains examples of yaml files required to deploy and run the \
Rook-Ceph operator and Ceph clusters in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-k8s-yaml-1.6.2+git0.ge8fd65f08-2.9.noarch.rpm"
RPM_HASH = "d5b1481b880cf2c6815c17d7361b2dbe9ea3f2c828d043ff3d06552f8d1656ed63936fab4dac123c13bf05160fdd8703494474bff29d85f0f364f187b39bfa54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
