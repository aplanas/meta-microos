SUMMARY = "FreePascal RAD IDE and Component Library"
DESCRIPTION = "Lazarus is a Rapid Application Development \
tool for the FreePascal compiler using the Lazarus component \
library - LCL. The LCL is included in this package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "f4e086ea0f65840ffb819d36da3296f15b7ffd38063dc221e900bc581f2c6155a0cbd5e128c990491aeac56d0cc99b21cd29ac0309cf35efa0f253ea06886a7d"

RPROVIDES:${PN} += "config-lazarus \
lazarus"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/instantfpc \
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
