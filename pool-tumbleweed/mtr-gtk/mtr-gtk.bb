SUMMARY = "Ping and Traceroute Network Diagnostic Tool"
DESCRIPTION = "Mtr is a network diagnostic tool which combines Ping and Traceroute \
into one program. This package contains mtr with a GTK interface. \
You'll find the text mode version in the mtr package."
LICENSE = "GPL-2.0-only"

PV = "0.95"

RPM_NAME = "mtr-gtk-0.95-2.1.aarch64.rpm"
RPM_HASH = "adec19ad843a3a0bc33a01a69ba4cf37d03be9728bf8f457cab9763f50d3f2e05282713084c496ed5e1352f61e9f0688e9af729a22dafdb5e571670830f0bf03"

RPROVIDES:${PN} += "mtr-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjansson.so.4 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
mtr \
xdg-utils"

inherit rpm
