SUMMARY = "MailImporter library for kdepim"
DESCRIPTION = "This package provides the mailimporter library, used by KDE PIM applications \
to import data from other mail formats (such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5MailImporter5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "936c5d0b01a6cc5b6af9c4e848b388eba08a0c1d50494c226c0622b72a91aef15f7aca0597d7536bd64f4848cf3416a5f9fe6dd76f26931fb569516279bb2a52"

RPROVIDES:${PN} += "libKPim5MailImporter.so.5 \
libKPim5MailImporter5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5PimCommon.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6 \
mailimporter"

inherit rpm
