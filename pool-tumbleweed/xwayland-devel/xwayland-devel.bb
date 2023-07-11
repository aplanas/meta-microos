SUMMARY = "Development files for Xwayland"
DESCRIPTION = "This package contains the Xwayland Server development files."
LICENSE = "MIT"

PV = "23.1.2"

RPM_NAME = "xwayland-devel-23.1.2-1.1.aarch64.rpm"
RPM_HASH = "8a1f2a1cdbd49254cfae3a5bd6cd6ab29e2847f05626060b9ad05568e9266d5bc956b52c3b972fd34974c1deee37972ed8b846bfa270782205348f89aa092e9e"

RPROVIDES:${PN} += "pkgconfig-xwayland \
xwayland-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c-compiler \
meson \
pkgconfig-libdrm \
pkgconfig-xau \
pkgconfig-xdmcp \
pkgconfig-xkbfile \
pkgconfig-xtrans \
pkgconfig-xv \
xwayland"

inherit rpm
