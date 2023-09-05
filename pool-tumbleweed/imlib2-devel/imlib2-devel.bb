SUMMARY = "Imlib 2 - development libraries"
DESCRIPTION = "These are the development headers and library for imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "imlib2-devel-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "70f0ce7ca50bf7c39047d2dd474911151f247a3d2b476274f46ea4877d994c9d17d1777145ef9243a0177470d1f2cd4eec5c0aefe0e698d76af8797ded30a715"

RPROVIDES:${PN} += "imlib2-devel \
pkgconfig-imlib2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libImlib2-1 \
xorg-x11-libX11-devel"

inherit rpm
