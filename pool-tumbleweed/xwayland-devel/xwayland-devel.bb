SUMMARY = "Development files for Xwayland"
DESCRIPTION = "This package contains the Xwayland Server development files."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "xwayland-devel-23.2.0-1.1.aarch64.rpm"
RPM_HASH = "60c65b4df84042eba846304c52c96f3dead2ba69b497273f7f0a101c013536dc6c0a4091dd1924760f531996160a874550b14d90345a14693d105645f8fd01da"

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
