SUMMARY = "Graphical USENET newsreader"
DESCRIPTION = "flnews is a FLTK-based client with graphical user interface to read \
USENET newsgroups."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "flnews-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "cfffa33a4c35ba6a07be2440765a93460a464de29a254ecbd4469d6a098e6b39a9b29857c5fcd6403b96f943a182e9cd9028e282f14e4adcfe85749e97c41fa1"

RPROVIDES:${PN} += "flnews"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfltk.so.1.3 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
xdg-utils"

inherit rpm
