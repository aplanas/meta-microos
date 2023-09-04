SUMMARY = "Configuration files common to github.com/containers"
DESCRIPTION = "Configuration files and manpages shared by tools that are based on the \
github.com/containers libraries, such as Buildah, CRI-O, Podman and Skopeo."
LICENSE = "Apache-2.0"

PV = "20230814"

RPM_NAME = "libcontainers-common-20230814-1.1.noarch.rpm"
RPM_HASH = "ddbee7d2e2b0700d93c5f02a33c63ae7d801b5cbffe4ec5305a28d1cd70fc317b1f31a609b1ba17bbd404ea520ad78ed8a381f469792775b3180422626c38355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-common \
libcontainers-common \
libcontainers-image \
libcontainers-storage"

RDEPENDS:${PN} += "/usr/bin/sed \
/usr/bin/sh \
libcontainers-policy"

inherit rpm
