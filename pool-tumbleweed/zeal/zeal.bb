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

RPROVIDES:${PN} += "zeal"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql5-sqlite \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb.so.1 \
update-desktop-files"

inherit rpm
