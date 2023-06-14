SUMMARY = "The LAME MP3 encoder"
DESCRIPTION = "LAME is an educational tool to be used for learning about MP3 encoding. \
The goal of the LAME project is to use the open source model to improve the \
psycho acoustics, noise shaping and speed of MP3. \
Another goal of the LAME project is to use these improvements for the basis of \
a patent free audio compression codec for the GNU project."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-3.100-5.3.aarch64.rpm"
RPM_HASH = "ab0bf36a4b573b14c988c934a26a670f84f6399008171e80bcc24c1b56f604e5045269d144c159858eb61bd62efd1f45a52a3fe0536510aaf15d11bf610c1c70"

RPROVIDES:${PN} += "lame"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmp3lame.so.0 \
libmp3lame0 \
libtinfo.so.6"

inherit rpm
