SUMMARY = "Tool helping to mirror a registry to a private one"
DESCRIPTION = "mirror-registry will analyse a remote registry and create a yaml file with all containers and tags matching a regex to sync with skopeo to a private registry. While this tool understands the architecture flag for containers, skopeo does not really use this information yet. If a repository contains multi-arch containers, it will fail if there is no container for the architecture it is running on, else it will use the architecture which it is running on."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "mirror-registry-1.4-1.2.aarch64.rpm"
RPM_HASH = "30fc664477a97163804840bfb1e6ad0eaefd71014fc71ea4e80182c9f861121dded86304ff3fb82adaf30971b6a65f26e14bdf1cf1a7d3dfb49e9179cfb9ac47"

RPROVIDES:${PN} += "mirror-registry \
mirror-registry(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
skopeo"

inherit rpm
