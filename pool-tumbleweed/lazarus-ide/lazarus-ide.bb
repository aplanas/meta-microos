SUMMARY = "Lazarus RAD IDE for Free Pascal"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package provides the Lazarus RAD IDE."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.2.6"

RPM_NAME = "lazarus-ide-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "499b6b58a51ada3f2c2526c8d0fe75a4e97520656cff051255ffb741d79bc9e9309549678e60cc8a6f7b6f948601950018741672295b5dec81687c2ea078c427"

RPROVIDES:${PN} += "lazarus-ide"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
fpc-src \
gdb \
hicolor-icon-theme \
lazarus-lcl \
lazarus-tools \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
make"

inherit rpm
