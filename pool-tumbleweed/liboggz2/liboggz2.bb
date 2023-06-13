SUMMARY = "Shared Libraries For Oggz"
DESCRIPTION = "liboggz is a library that provides simple parsing and seeking of \
files and streams based on the Ogg file format. liboggz requires \
libogg to work. \
liboggz knows about Ogg speex, Ogg vorbis, Ogg theora, and the Ogg \
based Annodex formats, thus allows parsing (though not decoding) of \
these files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "liboggz2-1.1.1-15.28.aarch64.rpm"
RPM_HASH = "545e95acfc709091c396a5c2ecd651a7e91be23c137dc8190378ab173306ceca9657ceef14585d9ff6a60742ae773022146c210f343807ec8aa2ef2fb6b1e762"

RPROVIDES:${PN} += "liboggz.so.2()(64bit) \
liboggz2 \
liboggz2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libogg.so.0()(64bit)"

inherit rpm
