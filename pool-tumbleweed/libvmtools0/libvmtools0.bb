SUMMARY = "Open Virtual Machine Tools - shared library"
DESCRIPTION = "This is a shared library used by several Open VM Tools components, \
such as vmware-toolbox-cmd and vmtoolsd (and its plugins)."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "libvmtools0-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "4230ed8000bb5bd2ebaf62038dc4bc91aa67e7722da5b430ce38ba9015f311a821c7df5a7dcf4cc947abab4060759f8aa3d12de11e8a3b041991ebc48444a965"

RPROVIDES:${PN} += "libDeployPkg.so.0()(64bit) \
libguestStoreClient.so.0()(64bit) \
libguestlib.so.0()(64bit) \
libhgfs.so.0()(64bit) \
libvgauth.so.0()(64bit) \
libvmtools.so.0()(64bit) \
libvmtools0 \
libvmtools0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libmspack.so.0()(64bit) \
libssl.so.3()(64bit) \
libtirpc.so.3()(64bit)"

inherit rpm
