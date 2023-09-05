SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libksieve5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "dbee59cf4a751543d0d4c617bd24c5ca934e2295318147d47e48d8737bc1a16b11768e3815336181c719708d2ecaffe8ebe3249c37abd3754631f832e949df4b"

RPROVIDES:${PN} += "libKPim5KManageSieve.so.5 \
libKPim5KSieve.so.5 \
libKPim5KSieveUi.so.5 \
libksieve5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5SonnetUi.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextEditTextToSpeech.so.1 \
libKF5WidgetsAddons.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5Mime.so.5 \
libKPim5PimCommon.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libksieve \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
