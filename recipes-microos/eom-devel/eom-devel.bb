SUMMARY = "MATE Desktop graphics viewer development files"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "eom-devel-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "d3678522cfe98184a9221a4ea664b12daa9281557e616977ba1271f693c1ed30efbbe9ad11c82a7c4d56761443306e016009bdcfb85ca337ea2b7b402c1e0066"

RPROVIDES:${PN} += "eom-devel eom-devel(aarch-64) mate-image-viewer-devel pkgconfig(eom)"
RDEPENDS:${PN} += "/usr/bin/pkg-config eom pkgconfig(gio-2.0) pkgconfig(gtk+-3.0)"

inherit rpm
