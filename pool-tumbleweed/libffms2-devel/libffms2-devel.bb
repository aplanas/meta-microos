SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "2.40+44"

RPM_NAME = "libffms2-devel-2.40+44-1.5.aarch64.rpm"
RPM_HASH = "c4d779f7c7f63900c1a1a2e72050892bfe43b2171a88a6982c95a55bab5c140f37be7c45cae889d794a2c942fc553226a6309de60dc7a02c0beb31eee14b9674"

RPROVIDES:${PN} += "libffms2-devel \
pkgconfig-ffms2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffms2-5"

inherit rpm
