SUMMARY = "The archiver base class library"
DESCRIPTION = "The archiver base class, used by specific archive formats, is made \
available as a library in its own right so that support for other \
archive formats can be built outside the kio-extras source tree."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkioarchive5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f3b516f6d729ffc69a40cf54f02eadf1d88d4b857b95469e21f4df31f35c1b5f08f59716b79e519500b8c50b0687992a8258c93e64a5eed17ecb42eedb47ca56"

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
