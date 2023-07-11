SUMMARY = "A Wayland terminal emulator"
DESCRIPTION = "A Wayland terminal emulator."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "foot-1.14.0-4.1.aarch64.rpm"
RPM_HASH = "9f3268e8ed2c499e14f5ecabca6a7fc4c449a93b12be1fff104cb2df1e4570bc64d02956792eed99d0386a093f14971b1e90ee7de16ad634aa4486717e3011c7"

RPROVIDES:${PN} += "foot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libutf8proc.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0 \
terminfo \
utempter"

inherit rpm
