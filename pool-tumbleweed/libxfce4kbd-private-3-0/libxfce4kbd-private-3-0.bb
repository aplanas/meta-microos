SUMMARY = "XFCE keyboard library for xfwm"
DESCRIPTION = "The libxfce4kbd-private library provides helper functions for xfwm4."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4kbd-private-3-0-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "677d42bd2eebddb7a70e98bbb432c89c497ff2498ff1d42fc933a4509e7350db5e75b10507e88517e61dbafef8cb3df92a5a342d9cff6e72b99c69102da6906b"

RPROVIDES:${PN} += "libxfce4kbd-private-3-0 \
libxfce4kbd-private-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
