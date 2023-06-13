SUMMARY = "Bar program for sway"
DESCRIPTION = "Bar program for sway."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "swaybar-1.8.1-2.1.aarch64.rpm"
RPM_HASH = "f9345e4292bfbe66980170350007d8f68ef02a32263f29b802580b605ec67615cf177ed69f6a23a17a27c2bd5a6279ac99f80b66cd6c95b1d15598a7eb62322c"

RPROVIDES:${PN} += "swaybar \
swaybar(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-c.so.5()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
libsystemd.so.0(LIBSYSTEMD_239)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
sway"

inherit rpm
