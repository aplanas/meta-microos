SUMMARY = "Quake II - Three Wave Capture The Flag for yamagi-quake2"
DESCRIPTION = "This package provides the Three Wave Capture The Flag game mode \
for yamagi-quake2, an enhanced port of the original Quake II."
LICENSE = "GPL-2.0-or-later"

PV = "1.09"

RPM_NAME = "yamagi-quake2-ctf-1.09-1.4.aarch64.rpm"
RPM_HASH = "62a13da4caa865eae32a774227103ec03650de654caefeed2d6d3db9563510c5d8aaed7b74e64b372e9f2c39c309cf48271ac82f9a95e581b8d31adb0aafeec6"

RPROVIDES:${PN} += "yamagi-quake2-ctf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
yamagi-quake2"

inherit rpm
