SUMMARY = "Development files for Xwayland"
DESCRIPTION = "This package contains the Xwayland Server development files."
LICENSE = "MIT"

PV = "23.1.1"

RPM_NAME = "xwayland-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "190491226fa7d706a2fc3413f606f27ad5bc660f26cf3c4a4a95ec65e7653cf40e2d55d4b7bdbb16440a4460f6713933c439629005bc69c3e6e5adfb2721bda9"

RPROVIDES:${PN} += "pkgconfig(xwayland) \
xwayland-devel \
xwayland-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c_compiler \
meson \
pkgconfig(libdrm) \
pkgconfig(xau) \
pkgconfig(xdmcp) \
pkgconfig(xkbfile) \
pkgconfig(xtrans) \
pkgconfig(xv) \
xwayland"

inherit rpm
