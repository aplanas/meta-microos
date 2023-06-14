SUMMARY = "A Wayland terminal emulator"
DESCRIPTION = "A Wayland terminal emulator."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "foot-1.14.0-2.1.aarch64.rpm"
RPM_HASH = "2cb12e2f4f75470d7d76fcf09137280850826880acb92afb654ecb7d356545dd830267938b750f531ec9174e228013fdda1ae4dcdb6151196ec1e8f853c9b771"

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
