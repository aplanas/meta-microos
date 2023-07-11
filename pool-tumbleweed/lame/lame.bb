SUMMARY = "The LAME MP3 encoder"
DESCRIPTION = "LAME is an educational tool to be used for learning about MP3 encoding. \
The goal of the LAME project is to use the open source model to improve the \
psycho acoustics, noise shaping and speed of MP3. \
Another goal of the LAME project is to use these improvements for the basis of \
a patent free audio compression codec for the GNU project."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-3.100-5.4.aarch64.rpm"
RPM_HASH = "47095b5020df4c9900c4115851f5ec1c07568e3826d0d1d9d9a5aafe904fa04e2706de3a69986f84736e4926a58ca2b7688e2bb238a81362d6dcf992955fd25a"

RPROVIDES:${PN} += "lame"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmp3lame.so.0 \
libmp3lame0 \
libtinfo.so.6"

inherit rpm
