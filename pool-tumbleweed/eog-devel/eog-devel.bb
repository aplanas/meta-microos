SUMMARY = "Development files for eog, an image viewer"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. \
 \
This subpackage contains all the necessary files and documentation for \
developing eog plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "eog-devel-44.2-1.1.aarch64.rpm"
RPM_HASH = "15a740aa0355478bdf2a9aa930fa68e600342f81753f64eeef40943542149100324b106a51df46e0793b8da80f5d542473137916062006eadf68292d702f8c5a"

RPROVIDES:${PN} += "eog-devel \
eog-devel(aarch-64) \
pkgconfig(eog)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eog \
pkgconfig(gtk+-3.0) \
pkgconfig(libhandy-1)"

inherit rpm
