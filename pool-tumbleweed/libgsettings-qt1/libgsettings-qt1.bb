SUMMARY = "Libraries for gsettings-qt"
DESCRIPTION = "Qt/QML bindings for GSettings. \
 \
This package is Libraries for gsettings-qt."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "libgsettings-qt1-0.2-1.9.aarch64.rpm"
RPM_HASH = "0b2778f0ede06ccb856096089aab01bf818f0917398848a47682a1537dfba5102873f37d6cf9aa34d9282e04aa8968933a055de16fd77979a4b253548a4448de"

RPROVIDES:${PN} += "libgsettings-qt.so.1 \
libgsettings-qt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
