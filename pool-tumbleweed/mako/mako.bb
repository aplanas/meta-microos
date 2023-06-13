SUMMARY = "A Wayland notification daemon"
DESCRIPTION = "A notification daemon for Wayland. Intended to be used with sway."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "mako-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "f2c8cc464f13907d55e7ebc59b5020d117c04f7ef1be4735601b7ce016a6b6f6126e08399fc718d03d1b762aa58534b9269f8da8c798b2f5c8035da87a0bc51b"

RPROVIDES:${PN} += "mako \
mako(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit)"

inherit rpm
