SUMMARY = "Development files for eog, an image viewer"
DESCRIPTION = "Eye of GNOME (eog) is a simple graphics viewer for the GNOME desktop \
which uses the gdk-pixbuf library. \
 \
This subpackage contains all the necessary files and documentation for \
developing eog plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "eog-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "905e4e6f24cad5a3607e5c560baef7b6827632db05ec18851ffbe6fbd2774d459d8aeaca3ff49c9bb1441d1eb441d3ff26b3d92dac5aa476484e976ef3a18821"

RPROVIDES:${PN} += "eog-devel eog-devel(aarch-64) pkgconfig(eog)"
RDEPENDS:${PN} += "/usr/bin/pkg-config eog pkgconfig(gtk+-3.0) pkgconfig(libhandy-1)"

inherit rpm
