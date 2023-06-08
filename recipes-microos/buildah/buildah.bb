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

RPM_NAME = "buildah-1.30.0-1.1.aarch64.rpm"
RPM_HASH = "78a7c2347c0a2eb31547a037c8045fb3757b16f2364a623db6c95574145b8c0bf1b765993df6aa5583784be38659f2f9cdf26db188336b4c2603454b61e7df7f"

RPROVIDES:${PN} += "buildah buildah(aarch-64)"
RDEPENDS:${PN} += "cni libc.so.6(GLIBC_2.34)(64bit) libcontainers-common libcontainers-image libcontainers-storage libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libseccomp.so.2()(64bit) runc slirp4netns"

inherit rpm
