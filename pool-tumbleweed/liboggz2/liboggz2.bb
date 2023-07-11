SUMMARY = "Shared Libraries For Oggz"
DESCRIPTION = "liboggz is a library that provides simple parsing and seeking of \
files and streams based on the Ogg file format. liboggz requires \
libogg to work. \
liboggz knows about Ogg speex, Ogg vorbis, Ogg theora, and the Ogg \
based Annodex formats, thus allows parsing (though not decoding) of \
these files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "liboggz2-1.1.1-15.29.aarch64.rpm"
RPM_HASH = "bff7341ccc40dd1bc7d260d2b94bb4a98145cf051cc40af4b18862d23e414ffabaceff617d143e64d329828dc36ad93759cc49860e3532b43ab4bcfde4d2378f"

RPROVIDES:${PN} += "liboggz.so.2 \
liboggz2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0"

inherit rpm
