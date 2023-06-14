SUMMARY = "Tools for rendering XPS documents"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libgxps-tools-0.3.2-1.11.aarch64.rpm"
RPM_HASH = "862f0c980a07522d16dc6108f4c155f148673cd7621c0041d3ed9c7e7b16d482e98e2640921ff1780d9c3e7e340486c20fa89d02370181f5f3ec56c38228c701"

RPROVIDES:${PN} += "libgxps-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgxps.so.2 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
