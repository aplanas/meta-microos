SUMMARY = "The ownCloud synchronization library"
DESCRIPTION = "The ownCloud synchronization library. It implements the ownCloud \
sync algorithm that keeps a local directory in sync with the \
content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "libowncloudsync0-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "45c33ec9f94d019e8ac103dd3256c4a045948f73a5d99d42ee2de9901f3ffe1966f953e60faafb2ffdb1f05bfff0b7a87a6ffbaaa764cd34bfe3105f7f436bd7"

RPROVIDES:${PN} += "libowncloud-csync.so.0 \
libowncloudResources.so.0 \
libowncloudsync.so.0 \
libowncloudsync0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLibreGraphAPI.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libqt5keychain1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
