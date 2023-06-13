SUMMARY = "RDP Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-rdp-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "42d418823d51f2f63b6fd82a968a1afb86012c80552597f4a240ac288994143b84e9b6610d4832818806a34c0e936038db150e5a666edbeff65dd97c9f1b4ba8"

RPROVIDES:${PN} += "remmina-plugin-rdp \
remmina-plugin-rdp(aarch-64)"

RDEPENDS:${PN} += "freerdp \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcups.so.2()(64bit) \
libfreerdp-client2.so.2()(64bit) \
libfreerdp2.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libwinpr2.so.2()(64bit) \
remmina"

inherit rpm
