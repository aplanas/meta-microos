SUMMARY = "Fast and functional graphics viewer development files"
DESCRIPTION = "xviewer is a simple graphics viewer for the Cinnamon desktop and \
others which uses the gdk-pixbuf library. It can deal with large \
images, and zoom and scroll with constant memory usage. Its goals \
are simplicity and standards compliance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "xviewer-devel-3.2.4-1.8.aarch64.rpm"
RPM_HASH = "6804e886293f7180a768fe7d97ee1f2e01edc5f2fe4ccf45187dc7550bf1a6a3caf094bba118e9fa21a8b7e70f3482a49c4c0beb77a6ae8d5af0bbb334f7348b"

RPROVIDES:${PN} += "pkgconfig-xviewer \
xviewer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gtk+-3.0 \
xviewer"

inherit rpm
