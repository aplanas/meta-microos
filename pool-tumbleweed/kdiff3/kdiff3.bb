SUMMARY = "Code Comparison Utility"
DESCRIPTION = "KDiff3 is a program that: \
 \
* Compares or merges two or three text input files or directories \
* Shows the differences line-by-line and character-by-character \
* Provides an automatic merge facility and an integrated editor for \
  solving merge conflicts \
* Supports KDE's KIO framework (allows accessing ftp, sftp, fish, smb, etc.)"
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "kdiff3-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "47c8a446542d8a0d72c3e3ea2f21944d19dc76fc04b1618ee8ab5a67a9fdfad88267746f873c0c1c69d46b52f146f1186f119396ba484fa189bf47d7ac9f89a1"

RPROVIDES:${PN} += "application() \
application(org.kde.kdiff3.desktop) \
kdiff3 \
kdiff3(aarch-64) \
metainfo() \
metainfo(org.kde.kdiff3.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
