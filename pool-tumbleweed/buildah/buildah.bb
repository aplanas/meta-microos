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

PV = "1.31.1"

RPM_NAME = "buildah-1.31.1-1.1.aarch64.rpm"
RPM_HASH = "3a71b29b17b294becf507131e098d641a13211ef1b70f807bf42811b630dd5aa33df805b248b0054b8ed52db6da48c1970d4a032e8d9abe5868e1e7ea894d4cd"

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
