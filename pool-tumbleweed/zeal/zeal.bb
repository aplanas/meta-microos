SUMMARY = "Offline API documentation browser"
DESCRIPTION = "Zeal is an offline API documentation browser inspired by Dash \
(OS X app). \
 * Quickly search documentation using Alt+Space (or a customised) \
   hotkey to display Zeal from any place in your workspace. \
 * Search in multiple sets of documentation at once. \
 * Don't be dependent on your internet connection. \
 * Integrate Zeal with Emacs, Sublime Text, or Vim. See Usage » \
   Editor plugins for details."
LICENSE = "GPL-3.0-only"

PV = "2.7.0~git20200517.404c3aa"

RPM_NAME = "zeal-2.7.0~git20200517.404c3aa-2.14.aarch64.rpm"
RPM_HASH = "a04a627a0f6aaf32e1fec77da7d0cee65c34cc7cae8b54069dd1c0aee7b0552c9ead27e39189bc5e64b1ac4430b5d4d158b066233aa115b8861387feb7d01e43"

RPROVIDES:${PN} += "application() \
application(org.zealdocs.Zeal.desktop) \
metainfo() \
metainfo(org.zealdocs.Zeal.appdata.xml) \
mimehandler(x-scheme-handler/dash) \
mimehandler(x-scheme-handler/dash-plugin) \
zeal \
zeal(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb.so.1()(64bit) \
update-desktop-files"

inherit rpm
