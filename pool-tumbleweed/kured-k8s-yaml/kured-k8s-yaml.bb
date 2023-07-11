SUMMARY = "Kubernetes yaml file to run kured container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
kured container in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kured-k8s-yaml-1.10.2-1.5.noarch.rpm"
RPM_HASH = "a224b3ed611c9aaf26e1e1071c4cc824321766bf55ae07aa0cc40924bd692fc7b2a3ec1725d2dc45e8c5bb63f153d95af6f3b8117e73e432597a6b2431b55d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kured-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
