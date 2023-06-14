SUMMARY = "Development library for codec2"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "codec2-devel-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "d0d6533b277e5a5c5f9855b757485d0ddb471277bc34890595cb3ec91a820627a651577fe0a9a0110e16826259fbbf4e2dc0504b3b08472765be13c82979ec4c"

RPROVIDES:${PN} += "cmake-codec2 \
codec2-devel \
pkgconfig-codec2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcodec2-1-1"

inherit rpm
