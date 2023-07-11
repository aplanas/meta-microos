SUMMARY = "Open Virtual Machine Tools - shared library"
DESCRIPTION = "This is a shared library used by several Open VM Tools components, \
such as vmware-toolbox-cmd and vmtoolsd (and its plugins)."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools0-12.2.0-5.1.aarch64.rpm"
RPM_HASH = "bd0dfb5f2f857cff51e0d8f1944968304480196af2464ae68b8b919007c4834d9add88fe442bc8239aeab34ccd4e4fdb579f2d1434b5e1f846d83c6911b4c42a"

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
