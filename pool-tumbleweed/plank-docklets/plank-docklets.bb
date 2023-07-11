SUMMARY = "A collection of docklets for the Plank dock"
DESCRIPTION = "This package contains a collection of docklets: clippy, clock, cpumonitor, \
desktop, trash and etc."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-docklets-0.11.89-2.5.aarch64.rpm"
RPM_HASH = "9805c2f2af8a866a0e70b90b7543869a77889896cedcf6535adab6511800eb22df30f6aa932e25fa64f781ba67be94ff844f3ca57617f51fbaf6b1b7674a2cd0"

RPROVIDES:${PN} += "plank-docklets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-menu-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libplank.so.1 \
libwnck-3.so.0 \
plank"

inherit rpm
