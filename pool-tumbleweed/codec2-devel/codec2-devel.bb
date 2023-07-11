SUMMARY = "Development library for codec2"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.1.1"

RPM_NAME = "codec2-devel-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "97688806e59f5c65fc68ed55a81d0b914776fd4571f805445c040a323dd844aa8220d0f1516385345247d74817ee4671817940bc3e5126d3ffef98d37b138189"

RPROVIDES:${PN} += "cmake-codec2 \
codec2-devel \
pkgconfig-codec2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcodec2-1-1"

inherit rpm
