SUMMARY = "EPS image format plugin for Qt"
DESCRIPTION = "This plugin provides support for the EPS document format for QtGui. As \
it invokes ghostscript for conversion, it should only be used in trusted \
environments."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kimageformats-eps-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "769bdb3d660227e9ad4604e1468a77cefb148b29c64174dec6b93d77df33c2eb1967b7e792b59c8bb0d28f8fea2798643bce81b6c92589dc4cf0b41305d5dc1c"

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
