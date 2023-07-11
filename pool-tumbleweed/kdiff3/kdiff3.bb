SUMMARY = "Code Comparison Utility"
DESCRIPTION = "KDiff3 is a program that: \
 \
* Compares or merges two or three text input files or directories \
* Shows the differences line-by-line and character-by-character \
* Provides an automatic merge facility and an integrated editor for \
  solving merge conflicts \
* Supports KDE's KIO framework (allows accessing ftp, sftp, fish, smb, etc.)"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.4"

RPM_NAME = "kdiff3-1.10.4-1.1.aarch64.rpm"
RPM_HASH = "be6f00df40df62030d382610585c1527e8e903f232aea5fa625dd54257377c8899859386f7176d4de1d90b0b254283c56f2e34d065d5cab61dfcdceff4b99327"

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
