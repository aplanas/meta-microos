SUMMARY = "EPS image format plugin for Qt"
DESCRIPTION = "This plugin provides support for the EPS document format for QtGui. As \
it invokes ghostscript for conversion, it should only be used in trusted \
environments."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kimageformats-eps-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "66f5011c7953e562fd21186ba4326da191a65b79ae35a1fdc797a88932dce16aab5e490458ba0c817a52d9417481eb7531b506737769de7cb099a2d0f4553572"

RPROVIDES:${PN} += "kimageformats-eps"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
