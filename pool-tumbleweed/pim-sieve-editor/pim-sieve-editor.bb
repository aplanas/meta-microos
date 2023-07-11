SUMMARY = "Sieve scripts editor for KDE PIM applications"
DESCRIPTION = "This package provides an editor, complete with syntax highlighting and \
command completion, to edit Sieve scripts ('server side filtering') \
in KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "pim-sieve-editor-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e1db5a902f59d3a74b2429d7a6a53d15284d5585778c14e727ec5d874ae6daf89307d872f681a838f179ad62b858669addc1687b88cb6b7ef28a71b7be8e9e03"

RPROVIDES:${PN} += "libsieveeditor.so.5 \
pim-sieve-editor"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmail \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5PimCommon.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5KManageSieve.so.5 \
libKPim5KSieveUi.so.5 \
libKPim5MailTransport.so.5 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackWidgets.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
