SUMMARY = "MailImporter library for kdepim"
DESCRIPTION = "This package provides the mailimporter library, used by KDE PIM applications \
to import data from other mail formats (such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5MailImporter5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bf608d34066507644687b46f7e9f952c74f0c3a083bf16bc0ba2f3482b239a3928f0b16341f9b6288252538ef038419b170325073040568eb20848abf5af911d"

RPROVIDES:${PN} += "libKPim5MailImporter.so.5 \
libKPim5MailImporter5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKPim5PimCommon.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6 \
mailimporter"

inherit rpm
