SUMMARY = "Libraries for gsettings-qt"
DESCRIPTION = "Qt/QML bindings for GSettings. \
 \
This package is Libraries for gsettings-qt."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "libgsettings-qt1-0.2-1.10.aarch64.rpm"
RPM_HASH = "019d61c8edeb26d1608c08942dd209ed5e1cf5256d90ce3e70350afa839649bd17966b2d49e4a319e6eec837da8de3c1c22045f9eaa822a3008b90f533a61751"

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
