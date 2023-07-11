SUMMARY = "Development files for eog, an image viewer"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. \
 \
This subpackage contains all the necessary files and documentation for \
developing eog plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.3"

RPM_NAME = "eog-devel-44.3-1.1.aarch64.rpm"
RPM_HASH = "dec394ac3b7b69c2d692e00fa505e6108c582fccb758b0ac32a6623e9934352ca9b0ebd291e4e8f831039ec33579c3280a519f1003cd588508f814bb8f11a977"

RPROVIDES:${PN} += "eog-devel \
pkgconfig-eog"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eog \
pkgconfig-gtk+-3.0 \
pkgconfig-libhandy-1"

inherit rpm
