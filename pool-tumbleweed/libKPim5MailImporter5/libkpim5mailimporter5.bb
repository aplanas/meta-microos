SUMMARY = "MailImporter library for kdepim"
DESCRIPTION = "This package provides the mailimporter library, used by KDE PIM applications \
to import data from other mail formats (such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5MailImporter5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a31c6611076fb2d5b95d88984ddbbff347164aa6bfb87c4e20a9064d16e024f9785b66397549e706d529a19108b4d99ce82f67f35d40cb5abdfecbcf66964367"

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
