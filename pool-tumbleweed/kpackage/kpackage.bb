SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kpackage-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "f594a3165a321a63ea925927e3ec1fcde73f17a350b80c0915c61670776162209946d8a8fdf1fc2f432c75914e765343f3d43798a74fd658157085825ed312b3"

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
