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

PV = "1.31.0"

RPM_NAME = "buildah-1.31.0-1.1.aarch64.rpm"
RPM_HASH = "03fd8a8da0f24137865757161b9457bce794cdd1f894e26bf64e3a0a3e2536f4a0c3c50db94a8de6af8e12016d995fcbaf01b10236899fd22a3deb9e74b5f7ea"

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
