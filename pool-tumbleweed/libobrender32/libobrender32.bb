SUMMARY = "Openbox Render Library"
DESCRIPTION = "This subpackage contains a utility function library used by Openbox \
for theme rendering."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "libobrender32-3.6.1-4.1.aarch64.rpm"
RPM_HASH = "cf57da3fcba9730433318c421ec10aeae0a8445dc091aa116b1304eaf754e477b0c06d37f0140e1f8da730844b23e89bdd787319006e26f86aa911c7767017fd"

RPROVIDES:${PN} += "libobrender.so.32()(64bit) \
libobrender32 \
libobrender32(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libobt.so.2()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoxft-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
