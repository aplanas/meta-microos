SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "alac-devel-0.0+git.20160511-3.14.aarch64.rpm"
RPM_HASH = "9659bbf5f8f10c027e8142372a98022b2cbb0fb694a4cdb286910fe7df0ae609324848c2c71bbb560be735be72ca593f37802a7b10c080abab601bc84216f1b5"

RPROVIDES:${PN} += "alac-devel \
libalac-devel"

RDEPENDS:${PN} += "libalac0"

inherit rpm
