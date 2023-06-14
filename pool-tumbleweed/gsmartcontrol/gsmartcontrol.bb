SUMMARY = "Hard Disk Health Inspection Tool"
DESCRIPTION = "GSmartControl is a graphical user interface for smartctl, which is a tool for \
querying and controlling SMART (Self-Monitoring, Analysis, and Reporting \
Technology) data in hard disk drives. It allows inspecting the drive's \
SMART data to determine its health, as well as run various tests on it."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.1.4"

RPM_NAME = "gsmartcontrol-1.1.4-1.5.aarch64.rpm"
RPM_HASH = "85ccfedc7345ae8b0b6a8de9c7b36465995e126fa188b370086f103bfc5c1bf61d93d0a1945d9c08e9caee77a0356311b395319b6d8642f7be35058199a52296"

RPROVIDES:${PN} += "gsmartcontrol"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libpangomm-1.4.so.1 \
libpcrecpp.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
pcre \
polkit \
smartmontools"

inherit rpm
