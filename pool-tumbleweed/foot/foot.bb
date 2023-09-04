SUMMARY = "A Wayland terminal emulator"
DESCRIPTION = "A Wayland terminal emulator."
LICENSE = "MIT"

PV = "1.15.3"

RPM_NAME = "foot-1.15.3-1.1.aarch64.rpm"
RPM_HASH = "bb5894ceb3fbd8fad70cc834fb23b8133fd6ae7f07678a8fe2401484ad02f2ccc53ecf6fb49f9d06d3ee920dbbac991dfe12dcc77b8f90c1b9707b0f0e7bd8f5"

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
