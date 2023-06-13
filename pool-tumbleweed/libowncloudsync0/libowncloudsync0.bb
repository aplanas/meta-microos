SUMMARY = "The ownCloud synchronization library"
DESCRIPTION = "The ownCloud synchronization library. It implements the ownCloud \
sync algorithm that keeps a local directory in sync with the \
content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "libowncloudsync0-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "43eb82a6b5677f6161b2811de6e481ca5deca42dff92937a471be81552587f75307001d76a653f77c3d31bcb4f9135dd771f1f913a94c6a04b6ac10f06c53060"

RPROVIDES:${PN} += "libowncloudResources.so.0()(64bit) \
libowncloud_csync.so.0()(64bit) \
libowncloudsync.so.0()(64bit) \
libowncloudsync0 \
libowncloudsync0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLibreGraphAPI.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libqt5keychain.so.1()(64bit) \
libqt5keychain1 \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
