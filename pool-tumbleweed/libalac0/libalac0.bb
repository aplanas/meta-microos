SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "libalac0-0.0+git.20160511-3.14.aarch64.rpm"
RPM_HASH = "b4c22345bcc1525a13b9d5d06e6e5fce435ccd4d4671e67eefc11b1c6f25094bb347ef94dc3d9bc00669d16972b6ff659642c691738319e4949bb0f7d46167f0"

RPROVIDES:${PN} += "libalac.so.0 \
libalac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
