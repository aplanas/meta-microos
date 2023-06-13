SUMMARY = "Development files for gnome-calculator"
DESCRIPTION = "The gnome-calculator-devel package contains libraries and header files for \
developing applications that use gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-calculator-devel-44.0-1.1.aarch64.rpm"
RPM_HASH = "4e25a3d3433a92b6ef9e0fd706a3220a3aa6a43fab1dcf417e87133be6d670b8138c63a6572964fb0ac5f79d5fc47f0758e57f8bc2611f3984cf014fc203b98c"

RPROVIDES:${PN} += "gnome-calculator-devel \
gnome-calculator-devel(aarch-64) \
pkgconfig(gcalc-2) \
pkgconfig(gci-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-calculator \
libgcalc-2-1_0_1 \
libgci-1-0_0_0 \
pkgconfig(gcalc-2) \
pkgconfig(gee-0.8) \
pkgconfig(gio-2.0) \
pkgconfig(gtk4)"

inherit rpm
