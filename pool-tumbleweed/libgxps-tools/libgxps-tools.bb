SUMMARY = "Tools for rendering XPS documents"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libgxps-tools-0.3.2-1.12.aarch64.rpm"
RPM_HASH = "18287c03f9b514c80f3b3ac715cbc9575bf3aebc21f78712497b43a17c71d21ded03c0d6f22742dc6c3ea4ce2116e522ece5256157c85a408396ab6861e3962c"

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
