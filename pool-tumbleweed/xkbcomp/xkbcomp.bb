SUMMARY = "Utility to compile XKB keyboard description"
DESCRIPTION = "The xkbcomp keymap compiler converts a description of an XKB keymap \
into one of several output formats."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "xkbcomp-1.4.6-1.3.aarch64.rpm"
RPM_HASH = "a33f1c7b7c817b7820701566af863452b401fb08abe559408bcec630db6a28287e00a1f99fa362b0eb300853fc996111f4406d22170624608da975d6c0da7f81"

RPROVIDES:${PN} += "xkbcomp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
