SUMMARY = "Window shuffler applet"
DESCRIPTION = "GUI and keyboard friendly window arranger for the budgie desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-window-shuffler-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "0ff597f5665fdbb8465526ad04bbbc791eed8b9ce22084d278530c82d5ded229b8ade584e7e65121b66b0a305a6b532e7e4bb2f15be2640fd31b68e8f55ab460"

RPROVIDES:${PN} += "application() application(org.ubuntubudgie.shufflercontrol.desktop) budgie-window-shuffler budgie-window-shuffler(aarch-64) libshufflerapplet.so()(64bit) metainfo() metainfo(org.ubuntubudgie.shufflercontrol.metainfo.xml)"
RDEPENDS:${PN} += "budgie-extras-daemon budgie-extras-lang ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatspi.so.0()(64bit) libbudgie-plugin.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libnotify.so.4()(64bit) libpeas-1.0.so.0()(64bit) libwnck-3.so.0()(64bit) xdpyinfo xev xlsatoms xlsclients xlsfonts xprop xvinfo xwininfo"

inherit rpm
