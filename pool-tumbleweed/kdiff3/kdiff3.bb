SUMMARY = "Code Comparison Utility"
DESCRIPTION = "KDiff3 is a program that: \
 \
* Compares or merges two or three text input files or directories \
* Shows the differences line-by-line and character-by-character \
* Provides an automatic merge facility and an integrated editor for \
  solving merge conflicts \
* Supports KDE's KIO framework (allows accessing ftp, sftp, fish, smb, etc.)"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.5"

RPM_NAME = "kdiff3-1.10.5-1.1.aarch64.rpm"
RPM_HASH = "24728d24b78a9459539079d05f7ad67b2325248ee22edb42c686cb79f790ee37c78ba4b53a3bdcfe8267362a578fcfa1f2a6923ab77baac8ca2ad3656361063f"

RPROVIDES:${PN} += "kdiff3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
