SUMMARY = "Kubernetes yaml file to run rbac-manager"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
rbac-manager in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "rbac-manager-k8s-yaml-1.4.2-1.5.noarch.rpm"
RPM_HASH = "94c4f22456b4d6b4d31c3af31dcc0a591d214ddff513c708f59d1429e3fceb2a3f96d6ed6e3361043756f801600885fed25c218a63536c930653a466a35d400b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbac-manager-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
