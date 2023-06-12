SUMMARY = "The archiver base class library"
DESCRIPTION = "The archiver base class, used by specific archive formats, is made \
available as a library in its own right so that support for other \
archive formats can be built outside the kio-extras source tree."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkioarchive5-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "e03ef7bc30b944dbf56d9dda0b2812339db9f39e6c480c02979bd1917dbfbc9395ea33bce13db35467f154b9a92be72b1c7ae400fc602008f5ccb2d71799799d"

RPROVIDES:${PN} += "libkioarchive.so.5()(64bit) \
libkioarchive5 \
libkioarchive5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
