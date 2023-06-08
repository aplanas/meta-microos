SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "alac-devel-0.0+git.20160511-3.13.aarch64.rpm"
RPM_HASH = "24b4b85cb725bb2304bcee8d14193c1afc4f77d36cfa10e559eb3ddb9736cf2c4b6f008e032f6824346c9c91515ba623629f69c4e2c23634d30cb542e17b6e2c"

RPROVIDES:${PN} += "alac-devel alac-devel(aarch-64) libalac-devel"
RDEPENDS:${PN} += "libalac0"

inherit rpm
