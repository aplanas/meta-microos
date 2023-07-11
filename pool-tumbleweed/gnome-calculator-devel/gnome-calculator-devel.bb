SUMMARY = "Development files for gnome-calculator"
DESCRIPTION = "The gnome-calculator-devel package contains libraries and header files for \
developing applications that use gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-calculator-devel-44.0-1.2.aarch64.rpm"
RPM_HASH = "b63bb55593b172c433d8cb4cf4c19fb9e62bfc7769f26b5812e47a5b9eddea8718ab4941971e84b1f99ece23930bc6b22f02d650d0842f496998041b1cfd5aa3"

RPROVIDES:${PN} += "gnome-calculator-devel \
pkgconfig-gcalc-2 \
pkgconfig-gci-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-calculator \
libgcalc-2-1-0-1 \
libgci-1-0-0-0 \
pkgconfig-gcalc-2 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gtk4"

inherit rpm
