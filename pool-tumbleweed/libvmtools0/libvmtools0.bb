SUMMARY = "Open Virtual Machine Tools - shared library"
DESCRIPTION = "This is a shared library used by several Open VM Tools components, \
such as vmware-toolbox-cmd and vmtoolsd (and its plugins)."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.3.0"

RPM_NAME = "libvmtools0-12.3.0-1.1.aarch64.rpm"
RPM_HASH = "7a1119327a76ab0c835a06065a94b965fcb425ac621e82c6b319bbdaa520bf4ed668fed8fa8350f12b22c244c36543aa95c6bbdb329803c54e0483bd2e899d07"

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
