SUMMARY = "Container image repository tool"
DESCRIPTION = "skopeo is a command line utility for various operations on container images and \
image repositories. skopeo is able to inspect a repository on a Docker registry \
and fetch images layers. skopeo can copy container images between various \
storage mechanisms."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "skopeo-1.13.0-1.1.aarch64.rpm"
RPM_HASH = "b79ed5affb8f965db8300ca831b6218d6126667546d6da0463c8cb78b774918bc7fecaee6c1d80c42cf84edc7b6b1170afc47379a87e352fb7f4b8c19413a5d6"

RPROVIDES:${PN} += "skopeo"

RDEPENDS:${PN} += "libc.so.6 \
libcontainers-common \
libdevmapper.so.1.03 \
libgpgme.so.11"

inherit rpm
