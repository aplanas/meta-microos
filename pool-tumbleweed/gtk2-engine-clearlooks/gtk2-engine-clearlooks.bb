SUMMARY = "Clearlooks GTK+ 2 Theme Engine"
DESCRIPTION = "The Clearlooks engine was the default theme of GNOME 2 since 2.12. It is \
a modular engine providing multiple styles such as glossy and gummy."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-clearlooks-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "6cdec5b9f19a371086f9de9b540d0a745a79876c08748e1df4ebe6fa499a0d83894638a2e8e936c3e84474323b7adc08dd893310d1b0464a0f236c6dbacf8bda"

RPROVIDES:${PN} += "gtk2-engine-clearlooks \
gtk2-engine-clearlooks(aarch-64) \
libclearlooks.so()(64bit)"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
