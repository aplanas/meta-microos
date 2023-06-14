SUMMARY = "The archiver base class library"
DESCRIPTION = "The archiver base class, used by specific archive formats, is made \
available as a library in its own right so that support for other \
archive formats can be built outside the kio-extras source tree."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkioarchive5-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "e03ef7bc30b944dbf56d9dda0b2812339db9f39e6c480c02979bd1917dbfbc9395ea33bce13db35467f154b9a92be72b1c7ae400fc602008f5ccb2d71799799d"

RPROVIDES:${PN} += "libkioarchive.so.5 \
libkioarchive5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
