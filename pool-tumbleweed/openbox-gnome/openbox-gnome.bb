SUMMARY = "Openbox GNOME integration"
DESCRIPTION = "This package provides openbox GNOME integration and tools"
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-gnome-3.6.1-4.1.aarch64.rpm"
RPM_HASH = "098a5f0ce95b88143ecb5b44fa7cf761351702e990b32a585a27668d80b31987cc2aa31acfd09f69f8fd6ad07fa70ca9a58bd1863a533fb49390d6d4813afdf8"

RPROVIDES:${PN} += "openbox-gnome"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
openbox"

inherit rpm
