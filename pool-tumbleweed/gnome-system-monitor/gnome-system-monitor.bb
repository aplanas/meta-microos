SUMMARY = "A process monitor for the GNOME desktop"
DESCRIPTION = "GNOME-system-monitor is a process and system monitor for the GNOME \
Desktop. It shows you what programs are running and how much \
processor time, memory, and disk space are being used."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-system-monitor-44.0-1.2.aarch64.rpm"
RPM_HASH = "03cd2a8e4134b1aadd26393ff860378fdf64be98e15ec553a61ae14514a0d15e52e721879492161c4425fe313fc291d2d9b6b8a385aa662cdd2c8a4e0238224a"

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
