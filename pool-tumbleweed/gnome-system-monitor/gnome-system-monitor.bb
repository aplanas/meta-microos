SUMMARY = "A process monitor for the GNOME desktop"
DESCRIPTION = "GNOME-system-monitor is a process and system monitor for the GNOME \
Desktop. It shows you what programs are running and how much \
processor time, memory, and disk space are being used."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-system-monitor-44.0-1.1.aarch64.rpm"
RPM_HASH = "ba89388d4f43e5e561ee8bcdb7172b5c458dba831f3a38cc8c64e096b81f6098b06904e6e8ee7066a43bd351d2bd2bce7a384d2d8d3a1de54cadad2630e7b9f3"

RPROVIDES:${PN} += "gnome-system-monitor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtop-2.0.so.11 \
libhandy-1.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
