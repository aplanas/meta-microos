SUMMARY = "Apple Lossless Audio Codec"
DESCRIPTION = "The Apple Lossless Audio Codec (ALAC) is an audio codec developed by Apple and \
supported on iPhone, iPad, most iPods, Mac and iTunes.  ALAC is a data \
compression method which reduces the size of audio files with no loss of \
information.  A decoded ALAC stream is bit-for-bit identical to the original \
uncompressed audio file."
LICENSE = "Apache-2.0"

PV = "0.0+git.20160511"

RPM_NAME = "libalac0-0.0+git.20160511-3.13.aarch64.rpm"
RPM_HASH = "6d108633f530596d6b766aec936159f8648236b8c4c159404672f19d385ef17ef86873ad643524e0ab73d8da8698a57edc3845e079e592ef24948ad526ae93b8"

RPROVIDES:${PN} += "libalac.so.0 \
libalac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
