SUMMARY = "The ownCloud synchronization library"
DESCRIPTION = "The ownCloud synchronization library. It implements the ownCloud \
sync algorithm that keeps a local directory in sync with the \
content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "libowncloudsync0-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "26f8909202f9ed7fdfe9a0513a31a77e430d1ea703f31bdf561b561ff1a0e9e93057de0faf0bc28c171834caecdbed5216f2260bbd497f65ce1e406979a2339b"

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
