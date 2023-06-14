SUMMARY = "Header files for the Gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (e.g. for handling and parsing of \
configuration files, reading/writing of XML files, interprocess \
communication etc)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-devel-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "5b88638ab0945eba86ea2ed032778354205d03a3bf4a905f5c68cee0ea286180e76397b0ab0a82dcdbbeb382ac90c5fe51185b26c2879a7de651b7066c53bc75"

RPROVIDES:${PN} += "cmake-gwengui-cpp \
cmake-gwengui-qt5 \
cmake-gwenhywfar \
gwenhywfar-devel \
pkgconfig-gwengui-fox16 \
pkgconfig-gwengui-gtk2 \
pkgconfig-gwengui-gtk3 \
pkgconfig-gwengui-qt5 \
pkgconfig-gwenhywfar"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libgwengui-fox16-79 \
libgwengui-gtk2-79 \
libgwengui-gtk3-79 \
libgwengui-qt5-79 \
libgwenhywfar79"

inherit rpm
