SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file. \
 \
This package contains a command-line utility to convert the ALAC format."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "alac-0.0+git.20160511-3.14.aarch64.rpm"
RPM_HASH = "270ff140453705845075bbcbdfa95c78fbb7a55ce605390f684fb19ab4087b6a18241ec910c29ab4b456e853ffaad28a1d4cef90a283a33e5c132d586b2d0cdc"

RPROVIDES:${PN} += "alac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalac.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
