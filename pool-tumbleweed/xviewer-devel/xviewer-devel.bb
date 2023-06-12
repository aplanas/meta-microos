SUMMARY = "Fast and functional graphics viewer development files"
DESCRIPTION = "xviewer is a simple graphics viewer for the Cinnamon desktop and \
others which uses the gdk-pixbuf library. It can deal with large \
images, and zoom and scroll with constant memory usage. Its goals \
are simplicity and standards compliance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "xviewer-devel-3.2.4-1.7.aarch64.rpm"
RPM_HASH = "fe0e0cdfd84f00b26fcb002853cd510dd97e11db0a13a48f8fe822c55d9915719d955aec40de3528b009f0685e711da255f020e390deda1e852319853416d007"

RPROVIDES:${PN} += "pkgconfig(xviewer) \
xviewer-devel \
xviewer-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(gtk+-3.0) \
xviewer"

inherit rpm
