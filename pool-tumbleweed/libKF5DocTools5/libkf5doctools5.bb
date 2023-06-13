SUMMARY = "Library to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.106.0"

RPM_NAME = "libKF5DocTools5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5b443f8269d98f493d249e1df4dff97949acc529561482bedc111303793b4268daeb8400d1f1107ad78b1d6d1ebc3ac15ec7712f74c200a38e1abaa9e2d600cf"

RPROVIDES:${PN} += "libKF5DocTools.so.5()(64bit) \
libKF5DocTools5 \
libKF5DocTools5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
