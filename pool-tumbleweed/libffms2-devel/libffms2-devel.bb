SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "2.40+44"

RPM_NAME = "libffms2-devel-2.40+44-1.6.aarch64.rpm"
RPM_HASH = "ee4fb8cb4ddfb4a2f61528682c6b9a490362b085fcdd7177a5e0f1aef4734cf65c945f145e2c6bbfd05673aabe5c273270a9585a264f94dea386bed231cdf855"

RPROVIDES:${PN} += "libffms2-devel \
pkgconfig-ffms2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffms2-5"

inherit rpm
