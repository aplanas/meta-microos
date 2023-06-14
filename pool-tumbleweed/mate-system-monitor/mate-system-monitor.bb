SUMMARY = "MATE Desktop system monitor"
DESCRIPTION = "Process viewer and system resource monitor for the MATE. This \
package allows you to graphically view and manipulate the running \
processes on your system. It also provides an overview of available \
resources such as CPU and memory."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-system-monitor-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "3b9f3699b8fda5312bfa61303a093096b4a24e55d0f0fe6dd8110a9fb8f046bb8d254103031f9c5ef22947fe44c78ae3fd7f14328ef63f74b93c7bb43aa7e396"

RPROVIDES:${PN} += "mate-system-monitor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtop-2.0.so.11 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libxml2.so.2 \
polkit"

inherit rpm
