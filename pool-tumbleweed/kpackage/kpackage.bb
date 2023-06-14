SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kpackage-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "b5280a811696f27e4fc4e6a7f235549fcae8b702044c5fa5d86e7737e46abf9945319e01619ddd69cb8875d1c29ab7125d4b70fff2f097ac03c178aed77ff3f8"

RPROVIDES:${PN} += "kpackage \
libKF5Package.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
