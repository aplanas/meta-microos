SUMMARY = "Hard Disk Health Inspection Tool"
DESCRIPTION = "GSmartControl is a graphical user interface for smartctl, which is a tool for \
querying and controlling SMART (Self-Monitoring, Analysis, and Reporting \
Technology) data in hard disk drives. It allows inspecting the drive's \
SMART data to determine its health, as well as run various tests on it."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.1.4"

RPM_NAME = "gsmartcontrol-1.1.4-1.5.aarch64.rpm"
RPM_HASH = "85ccfedc7345ae8b0b6a8de9c7b36465995e126fa188b370086f103bfc5c1bf61d93d0a1945d9c08e9caee77a0356311b395319b6d8642f7be35058199a52296"

RPROVIDES:${PN} += "application() \
application(gsmartcontrol.desktop) \
gsmartcontrol \
gsmartcontrol(aarch-64) \
metainfo() \
metainfo(gsmartcontrol.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libpcrecpp.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
pcre \
polkit \
smartmontools"

inherit rpm
