SUMMARY = "Header files for the Gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (e.g. for handling and parsing of \
configuration files, reading/writing of XML files, interprocess \
communication etc)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-devel-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "b963827d4a5ff52af90a404a6a870ed64a25c4010c4cf07ab6273a5b7fb2d7aa33e788d85d62fa7feeb351cde2ff81da4217acec8dc071e2f622a5c2d205f213"

RPROVIDES:${PN} += "cmake-gwengui-cpp \
cmake-gwengui-qt5 \
cmake-gwenhywfar \
gwenhywfar-devel \
pkgconfig-gwengui-fox16 \
pkgconfig-gwengui-gtk2 \
pkgconfig-gwengui-gtk3 \
pkgconfig-gwengui-qt5 \
pkgconfig-gwenhywfar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libgwengui-fox16-79 \
libgwengui-gtk2-79 \
libgwengui-gtk3-79 \
libgwengui-qt5-79 \
libgwenhywfar79"

inherit rpm
