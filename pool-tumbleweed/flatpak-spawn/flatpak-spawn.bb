SUMMARY = "Command-line frontend for the org.freedesktop.Flatpak service"
DESCRIPTION = "This package contains a number of command-line utilities for use inside \
Flatpak sandboxes. They work by talking to portals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "flatpak-spawn-1.0.5-2.4.aarch64.rpm"
RPM_HASH = "1baf1aaef066e3efb86dec5d5e3b92f96d1e559c91814c059f7636bd026250465fe941036e9589d14d839db6bb02d45e09804a4ff153baed2d46a2ce40ad80cc"

RPROVIDES:${PN} += "flatpak-spawn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
