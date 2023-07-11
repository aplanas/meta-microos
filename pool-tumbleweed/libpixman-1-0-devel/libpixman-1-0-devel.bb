SUMMARY = "Development files for the Pixel Manipulation library"
DESCRIPTION = "Pixman is a pixel manipulation library for X and cairo."
LICENSE = "MIT"

PV = "0.42.2"

RPM_NAME = "libpixman-1-0-devel-0.42.2-1.4.aarch64.rpm"
RPM_HASH = "85bdcb789c6316ce63b2f1fe0ba00cce8e19311531b3b1b6e39d6df3a31a611c1c1221fcb7eb4e54285b2b7e83a4d1932770b95e28fcead051ccfe8ac8cbb630"

RPROVIDES:${PN} += "libpixman-1-0-devel \
pkgconfig-pixman-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpixman-1-0"

inherit rpm
