SUMMARY = "Graphical User Interface for fluidsynth"
DESCRIPTION = "Qsynth is a fluidsynth GUI front-end application written in C++ around the Qt5 \
toolkit using Qt Designer."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.10"

RPM_NAME = "qsynth-0.9.10-1.1.aarch64.rpm"
RPM_HASH = "8c76bde7d56cf8b3ada6845de62e5e53021a6ba98f6ea7295a37376ada7850b4d50987b43318bf6dd732c59814f9e8ff7c9ddcb9fb6ce91905d0f07d55993774"

RPROVIDES:${PN} += "application() \
application(org.rncbc.qsynth.desktop) \
metainfo() \
metainfo(org.rncbc.qsynth.metainfo.xml) \
qsynth \
qsynth(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libfluidsynth.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
