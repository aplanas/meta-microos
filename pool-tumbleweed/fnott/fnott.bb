SUMMARY = "Lightweight notification daemon for Wayland"
DESCRIPTION = "Lightweight notification daemon for Wayland."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "fnott-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "ead7bde3747b65181f970b21ec0fcbf253d7e6ee4a0e45d99434fa60a41afe9ff3ef94beb46dade569664c2e1ff27e0e41efec4243bb6a9ddf06db5cb276e3b1"

RPROVIDES:${PN} += "application() \
application(fnott.desktop) \
fnott \
fnott(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfcft.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit)"

inherit rpm
