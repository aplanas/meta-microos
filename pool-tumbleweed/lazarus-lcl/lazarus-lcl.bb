SUMMARY = "Lazarus Component Library"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains the common parts of the Lazarus Component Library."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-lcl-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "10644716c478e260c115a1560ba517cbbb7ae992b9d6b3dbfc2ec0eb56e61dcd65b1c96fb40306725d8c64afa4e75667c3c6917661d7a5f24195e956b43df390"

RPROVIDES:${PN} += "lazarus-lcl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
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
libpango-1.0.so.0"

inherit rpm
