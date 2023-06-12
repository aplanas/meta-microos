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

PV = "1.30.0"

RPM_NAME = "buildah-1.30.0-1.2.aarch64.rpm"
RPM_HASH = "2b1070a60f6b2bbb6795085d767e5bcf0db0c7c821d596ba4e838f79367ee35c0452199ea680595530c0fb7f1f2e155df175910b0e621117d328e78d81c9cfca"

RPROVIDES:${PN} += "buildah \
buildah(aarch-64)"
RDEPENDS:${PN} += "cni \
libc.so.6(GLIBC_2.34)(64bit) \
libcontainers-common \
libcontainers-image \
libcontainers-storage \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libseccomp.so.2()(64bit) \
runc \
slirp4netns"

inherit rpm
