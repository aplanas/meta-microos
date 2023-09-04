SUMMARY = "Development files for libacars"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libacars."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "libacars2-devel-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "5897dea1e55149dcfc5833954dc8191af2cec4e3fb691996a763d267753b6ae38fbb7fe598cb14b47356d0c2cbaedddc9071f41ec15f20c237367dbf10e30996"

RPROVIDES:${PN} += "libacars2-devel \
pkgconfig-libacars-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacars-2-2"

inherit rpm
