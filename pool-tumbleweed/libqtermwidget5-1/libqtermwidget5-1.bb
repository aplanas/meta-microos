SUMMARY = "Qt5 terminal widget"
DESCRIPTION = "QTermWidget is a project based on the KDE4 \
Konsole application whose goal is to provide a Unicode- \
enabled, embeddable Qt widget to be used as a built-in console (or \
terminal emulation widget). Though Konsole is able of getting embedded, \
it is possible to have Qt without KDE. The original \
Konsole code was rewritten entirely with using Qt only, and all \
code dealing with user interface parts and session management was \
removed."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libqtermwidget5-1-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "74014548c054f3e91714801b1eb2be0a2055c3bf81ec9b64431bfd97fab1a4edea594e7b3f5d92b9e28f20176a1cb36fefe340d83988b3e8db4d5e38120425d8"

RPROVIDES:${PN} += "libqtermwidget5-1 \
libqtermwidget5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libutf8proc.so.2 \
qtermwidget-qt5-data"

inherit rpm
