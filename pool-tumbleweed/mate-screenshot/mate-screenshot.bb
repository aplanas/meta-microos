SUMMARY = "MATE screenshot maker"
DESCRIPTION = "This is the MATE screenshot maker as shipped with the MATE utilities. \
mate-screenshot is a program which cantake desktop screenshots and \
save them."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-screenshot-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "d891f7d8548fa8793298cfc1b9f88b8f2e43a204c578ef2d7bc3b620717e6606a50bb38d30efc1fc19f3cbea369457b8dd205a1d774026d030cb43190d053880"

RPROVIDES:${PN} += "mate-screenshot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
