SUMMARY = "Xfdashboard Development Files"
DESCRIPTION = "This package provides files required for development for Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-devel-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "4b700adf6ed5fa12f9307a9abc0e955eb2816e5e4fd05b8444b643a515f011c51987cdf54ad3c142a341913316a194b809b016a0c4d9f865eae673efa7c6e9aa"

RPROVIDES:${PN} += "pkgconfig-libxfdashboard \
xfdashboard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfdashboard0 \
pkgconfig-clutter-1.0 \
pkgconfig-clutter-cogl-1.0 \
pkgconfig-clutter-gdk-1.0 \
pkgconfig-garcon-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libwnck-3.0 \
pkgconfig-libxfce4ui-2 \
pkgconfig-libxfce4util-1.0 \
pkgconfig-libxfconf-0"

inherit rpm
