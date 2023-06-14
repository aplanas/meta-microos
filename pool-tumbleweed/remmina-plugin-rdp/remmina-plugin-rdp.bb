SUMMARY = "RDP Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-rdp-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "42d418823d51f2f63b6fd82a968a1afb86012c80552597f4a240ac288994143b84e9b6610d4832818806a34c0e936038db150e5a666edbeff65dd97c9f1b4ba8"

RPROVIDES:${PN} += "remmina-plugin-rdp"

RDEPENDS:${PN} += "freerdp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcups.so.2 \
libfreerdp-client2.so.2 \
libfreerdp2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwinpr2.so.2 \
remmina"

inherit rpm
