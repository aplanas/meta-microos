SUMMARY = "FreePascal RAD IDE and Component Library"
DESCRIPTION = "Lazarus is a Rapid Application Development \
tool for the FreePascal compiler using the Lazarus component \
library - LCL. The LCL is included in this package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-2.2.6-1.4.aarch64.rpm"
RPM_HASH = "c6f78e312d372ab49140fa11ca2bcbca0976941738f59b43c80ec0671ff0ac745f36199e15f0dfff95c449b1fd71912d0f6f729e6a21b071bb87e3de01fd4ebf"

RPROVIDES:${PN} += "config-lazarus \
lazarus"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/instantfpc \
/usr/bin/sh \
binutils \
desktop-file-utils \
fpc \
fpc-src \
gcc \
gdb \
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
make \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0 \
shared-mime-info"

inherit rpm
