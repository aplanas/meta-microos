SUMMARY = "Tool helping to mirror a registry to a private one"
DESCRIPTION = "mirror-registry will analyse a remote registry and create a yaml file with all containers and tags matching a regex to sync with skopeo to a private registry. While this tool understands the architecture flag for containers, skopeo does not really use this information yet. If a repository contains multi-arch containers, it will fail if there is no container for the architecture it is running on, else it will use the architecture which it is running on."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "mirror-registry-1.4-1.3.aarch64.rpm"
RPM_HASH = "b96e74105556b4ce986b1f09029a5e11f9755228856258e2ae7a482f894b37f744269ab3e5d93578d374157b6bb8186255ba9a795a17968732767449c6893299"

RPROVIDES:${PN} += "mirror-registry"

RDEPENDS:${PN} += "libc.so.6 \
skopeo"

inherit rpm
