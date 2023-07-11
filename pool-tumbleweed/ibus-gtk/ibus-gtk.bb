SUMMARY = "IBus input method support for gtk2 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk2."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-gtk-1.5.28-2.2.aarch64.rpm"
RPM_HASH = "8d1e7f0ff9effb137d82fefedcfb43561ea40bb1c1692c7ffbb8b31407b7580b11626198d6c9f07d006784e6875933dbcd00c7a535c201ad1be214e439c6ab45"

RPROVIDES:${PN} += "ibus-gtk"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libibus-1.0.so.5 \
libpango-1.0.so.0"

inherit rpm
