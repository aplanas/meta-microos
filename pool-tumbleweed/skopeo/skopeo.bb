SUMMARY = "Container image repository tool"
DESCRIPTION = "skopeo is a command line utility for various operations on container images and \
image repositories. skopeo is able to inspect a repository on a Docker registry \
and fetch images layers. skopeo can copy container images between various \
storage mechanisms."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-1.12.0-1.1.aarch64.rpm"
RPM_HASH = "f58331aa1914d507755edd3561171d69542d9779e44f143e807126f5b919a142a3387b75be05c6c5a10950ff3bb6782588d1058c40fd91280c9075ccbaf64643"

RPROVIDES:${PN} += "skopeo"

RDEPENDS:${PN} += "libc.so.6 \
libcontainers-common \
libdevmapper.so.1.03 \
libgpgme.so.11"

inherit rpm
