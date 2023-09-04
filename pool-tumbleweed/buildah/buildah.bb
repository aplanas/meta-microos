SUMMARY = "Tool for building OCI containers"
DESCRIPTION = "Buildah provides a command line tool which can be used to: \
- Create a working container, either from scratch or using an image as a \
  starting point \
- Create an image, either from a working container or via the instructions in a \
  Dockerfile \
- Build images in either the OCI image format or the traditional \
  upstream docker image format \
- Mount a working container's root filesystem for manipulation \
- Unmount a working container's root filesystem \
- Update the contents of a container's root filesystem \
- Delete a working container or an image"
LICENSE = "Apache-2.0"

PV = "1.31.2"

RPM_NAME = "buildah-1.31.2-1.1.aarch64.rpm"
RPM_HASH = "73fcbad382542cd8504ab59d9322a00cdd10596bb933e596a3b1a709e9646f3ed795a4267a948da2184c4d65b27c2a151a528a51cc95672920b65d231508b09e"

RPROVIDES:${PN} += "buildah"

RDEPENDS:${PN} += "cni \
libc.so.6 \
libcontainers-common \
libcontainers-image \
libcontainers-storage \
libgpgme.so.11 \
libseccomp.so.2 \
runc \
slirp4netns"

inherit rpm
