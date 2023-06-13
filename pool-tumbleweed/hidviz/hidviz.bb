SUMMARY = "A tool for in-depth analysis of USB HID devices communication"
DESCRIPTION = "Hidviz is a GUI application for in-depth analysis of USB HID class devices. \
The 2 main usecases of this application are reverse-engineering existing \
devices and developing new USB HID devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "hidviz-0.2-1.3.aarch64.rpm"
RPM_HASH = "ff9cd7d55ea4200b02ae54adc1132f5ffe1034774c1108ade0a2148a7eaa8a23ff69624182d139b67793c5b0cc89af2cc4a572d6f30fdb280e3d5d7e69f9e5de"

RPROVIDES:${PN} += "application() \
application(hidviz.desktop) \
hidviz \
hidviz(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
