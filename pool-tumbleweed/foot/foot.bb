SUMMARY = "A Wayland terminal emulator"
DESCRIPTION = "A Wayland terminal emulator."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "foot-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "d60c8dccd123c25802455ede11c45f377ad8f22958a275ad99ea1f27e5fbb265e3b586f146cdaaca516ed93934f36d138ec468299f026d23214da9101f0618b6"

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
