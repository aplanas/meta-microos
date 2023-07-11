SUMMARY = "RDP Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-rdp-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "7c49b35f8cce61612eed8ac7f83c4dc307940d3436a0d3cccdcbdf737c46c12e881575500ce3f9b980caf315ddcd1f44690af3a8705daf4753a089d936f08cf2"

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
