SUMMARY = "Kubernetes YAML file manifests for deploying a Ceph cluster"
DESCRIPTION = "This package contains examples of yaml files required to deploy and run the \
Rook-Ceph operator and Ceph clusters in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-k8s-yaml-1.6.2+git0.ge8fd65f08-2.8.noarch.rpm"
RPM_HASH = "5a92b181a58bdc1900d5197099cc756ade3542587741afef82bdfcf664bca1d963eda38f44cd36091efb9809de33267eed7c506b43fafead8f463b5250fb1001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
