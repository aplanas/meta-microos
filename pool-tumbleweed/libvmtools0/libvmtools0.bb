SUMMARY = "Open Virtual Machine Tools - shared library"
DESCRIPTION = "This is a shared library used by several Open VM Tools components, \
such as vmware-toolbox-cmd and vmtoolsd (and its plugins)."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools0-12.2.0-5.2.aarch64.rpm"
RPM_HASH = "461c6c8ba9a6a13a32802bc49f31e48f041aa44c8ddd3cebfefb74dd597413757a1fcda77e93cea283e8cae0a0132082302100ed3887c49fcaea2bf49c1b3c8e"

RPROVIDES:${PN} += "libDeployPkg.so.0 \
libguestStoreClient.so.0 \
libguestlib.so.0 \
libhgfs.so.0 \
libvgauth.so.0 \
libvmtools.so.0 \
libvmtools0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libmspack.so.0 \
libssl.so.3 \
libtirpc.so.3"

inherit rpm
