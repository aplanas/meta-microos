SUMMARY = "Container image repository tool"
DESCRIPTION = "skopeo is a command line utility for various operations on container images and \
image repositories. skopeo is able to inspect a repository on a Docker registry \
and fetch images layers. skopeo can copy container images between various \
storage mechanisms."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-1.12.0-1.2.aarch64.rpm"
RPM_HASH = "6338733bac1d5e7c7e9ce4c826b3d7380eef5e9d6badf5f8c429869cf716b3ddebd827e2bc806ed3cd96d1e5c98838bbd01d9badde5dbc86973e84e2da810a4f"

RPROVIDES:${PN} += "skopeo"

RDEPENDS:${PN} += "libc.so.6 \
libcontainers-common \
libdevmapper.so.1.03 \
libgpgme.so.11"

inherit rpm
