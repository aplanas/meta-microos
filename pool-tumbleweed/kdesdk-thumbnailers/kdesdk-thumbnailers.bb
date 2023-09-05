SUMMARY = "Translation file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of po files."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdesdk-thumbnailers-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "152ca9acf974b0a017a98acf649eee213dc03e457c4ee30d11cb073823313960b560e88cfa8055e17906ed746697add2784576288c3601531ee6ad51d02cbcc8"

RPROVIDES:${PN} += "kdesdk-thumbnailers"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5KIOWidgets.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgettextpo.so.0 \
libstdc++.so.6"

inherit rpm
