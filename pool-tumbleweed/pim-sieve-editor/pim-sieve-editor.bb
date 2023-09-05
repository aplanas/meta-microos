SUMMARY = "Sieve scripts editor for KDE PIM applications"
DESCRIPTION = "This package provides an editor, complete with syntax highlighting and \
command completion, to edit Sieve scripts ('server side filtering') \
in KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "pim-sieve-editor-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "54a06256390fbcfe8a037330232255ffadf70e579f9378c320c10cfcc8dd9643df700e052352ec5b418827492ffe2c8974b029e5f2018e55badee45df14652a8"

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
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5KManageSieve.so.5 \
libKPim5KSieveUi.so.5 \
libKPim5MailTransport.so.5 \
libKPim5PimCommon.so.5 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackWidgets.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
