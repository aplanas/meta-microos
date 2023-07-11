SUMMARY = "Graphical Disk Usage Utility"
DESCRIPTION = "K4DirStat (KDE Directory Statistics) is a small utility program that sums up \
disk usage for directory trees, very much like the Unix 'du' command. It \
displays the disk space used up by a directory tree, both numerically and \
graphically."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.2"

RPM_NAME = "k4dirstat-3.4.2-1.4.aarch64.rpm"
RPM_HASH = "4bc3fcbbe04892f35a1f0cacb818fce55b4f4a647ac36db795a3d0f7535c53cb52543f63ae95f5b02a938031b8a7c8a87650e20f27104bdab36b7352355b4789"

RPROVIDES:${PN} += "k4dirstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
