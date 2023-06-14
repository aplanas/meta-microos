SUMMARY = "matecomponent-based library for the MATE Panel Applet"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.3"

RPM_NAME = "libmate-panel-applet-4-1-1.26.3-1.1.aarch64.rpm"
RPM_HASH = "77a24089e6a4bd94ec41a8f782da4cb0ea56848571b79112f520a4d01e76861e502031c9cb0cb730c8d9b22b2532b5b7ef50fe1543ed774181e1f20a6986a8f0"

RPROVIDES:${PN} += "libmate-panel-applet-4-1 \
libmate-panel-applet-4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
