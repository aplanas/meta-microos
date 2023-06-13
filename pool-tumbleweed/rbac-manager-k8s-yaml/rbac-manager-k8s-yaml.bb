SUMMARY = "Kubernetes yaml file to run rbac-manager"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
rbac-manager in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "rbac-manager-k8s-yaml-1.4.2-1.4.noarch.rpm"
RPM_HASH = "eba0702812037f8fecfbb1c6ccd6dba502477197409bbbd0f81eeb7d7a2ca30c48194f03f00991bf56b66ea73c89b30971d96ca5c388c95d6b801ee51b8e5393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbac-manager-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
