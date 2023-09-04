SUMMARY = "Container image repository tool"
DESCRIPTION = "skopeo is a command line utility for various operations on container images and \
image repositories. skopeo is able to inspect a repository on a Docker registry \
and fetch images layers. skopeo can copy container images between various \
storage mechanisms."
LICENSE = "Apache-2.0"

PV = "1.13.2"

RPM_NAME = "skopeo-1.13.2-1.1.aarch64.rpm"
RPM_HASH = "44fdd8887a4cb18b8f6d5bed6b8a1be28e6d5226d3797ac9011baa817212ce9ae292530970d042c38638855135e08f21ac230475671d413f7c627c580833f2de"

RPROVIDES:${PN} += "skopeo"

RDEPENDS:${PN} += "libc.so.6 \
libcontainers-common \
libdevmapper.so.1.03 \
libgpgme.so.11"

inherit rpm
