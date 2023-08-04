SUMMARY = "Development library for codec2"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "codec2-devel-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "b0bd3584223b8181369a61fafac209084cb3a893ed0373a755db870c5856a067d6425645ee09d52fe93b6e7e810e86adca0431b97eb9f7aa4e1bc9199b026e0b"

RPROVIDES:${PN} += "cmake-codec2 \
codec2-devel \
pkgconfig-codec2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcodec2-1-2"

inherit rpm
