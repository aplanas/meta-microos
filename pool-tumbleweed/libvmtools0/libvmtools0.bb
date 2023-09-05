SUMMARY = "Open Virtual Machine Tools - shared library"
DESCRIPTION = "This is a shared library used by several Open VM Tools components, \
such as vmware-toolbox-cmd and vmtoolsd (and its plugins)."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools0-12.2.0-6.1.aarch64.rpm"
RPM_HASH = "9e8add2c021aba940f089a95e134ed423580a1c7e3120b8083b25c4aca93d8a3b1e65e701357d125aa1f1e4de23859a1e463b01020e473d544bc8ee8254074f1"

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
