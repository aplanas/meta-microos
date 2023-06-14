SUMMARY = "Configuration files common to github.com/containers"
DESCRIPTION = "Configuration files and manpages shared by tools that are based on the \
github.com/containers libraries, such as Buildah, CRI-O, Podman and Skopeo."
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-common-20230214-5.1.noarch.rpm"
RPM_HASH = "9a6add7942f4725753d8074f676bad6e96c44f704659d62fc21fd15d25a790a2fee52f476ea1b8117378ce711174e64a52b11f0e87e2335edd13c9a09bab42ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-common \
libcontainers-common \
libcontainers-image \
libcontainers-storage"

RDEPENDS:${PN} += "-libcontainers-sles-mounts if sles-release \
/bin/sh \
/usr/bin/grep \
/usr/bin/sed"

inherit rpm
