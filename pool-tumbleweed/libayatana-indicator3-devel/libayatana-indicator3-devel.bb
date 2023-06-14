SUMMARY = "Development files for the Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator3-devel-0.9.0-1.11.aarch64.rpm"
RPM_HASH = "fdf8c20d24a043be424be81f4b6032ef554329e16f6bdf756095bcf1fddafe28b73d1c152f37280c7af0c4310757de5c0d860d9204cf3767542aac34155e5f3d"

RPROVIDES:${PN} += "libayatana-indicator3-devel \
pkgconfig-ayatana-indicator3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-indicator3-7 \
pkgconfig-gtk+-3.0 \
pkgconfig-libayatana-ido3-0.4"

inherit rpm
