SUMMARY = "IBus input method support for gtk2 applications"
DESCRIPTION = "This package contains ibus im module for use by gtk2."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-gtk-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "a68cf937fbfcc8dd1f0df7b721fd9bfbb158fa5f0447fce24417899d16360709b06d8ba244fa0f167fb2d3b97ef01825895dbf9e1aaa76e1be0ea6b7faafc91f"

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
