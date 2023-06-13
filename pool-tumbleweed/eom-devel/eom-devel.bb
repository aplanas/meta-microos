SUMMARY = "MATE Desktop graphics viewer development files"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "eom-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "f37a4cb7df84ade80742e20eb0b4ca3f228127954e214848561b13f42aa3c9bc8efd33547d3d6757604ddde8deb0ab6d3bf95891e102f14ad8c0853bad024a4b"

RPROVIDES:${PN} += "eom-devel \
eom-devel(aarch-64) \
mate-image-viewer-devel \
pkgconfig(eom)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eom \
pkgconfig(gio-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
