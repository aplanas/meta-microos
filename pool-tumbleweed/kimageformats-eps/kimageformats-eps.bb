SUMMARY = "EPS image format plugin for Qt"
DESCRIPTION = "This plugin provides support for the EPS document format for QtGui. As \
it invokes ghostscript for conversion, it should only be used in trusted \
environments."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kimageformats-eps-5.109.0-2.1.aarch64.rpm"
RPM_HASH = "215406a68a726ae76596fc68c0b1352737c9e6df273e6980f1036314c6c5bafcdc5cfd0b08a169e490deb87512900cfe36bac5efd30f53544a4e684bd9ed31db"

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
