SUMMARY = "File Manager for the Xfce Desktop Environment"
DESCRIPTION = "Thunar is a file manager for the Xfce desktop environment. Its \
functionality can be extended through plugins. Thunar can also be \
extended by writing scripts to be placed in the context menu for \
various file types."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.6"

RPM_NAME = "thunar-4.18.6-1.1.aarch64.rpm"
RPM_HASH = "4905eff97739d9c8ef40f3a64351706af5693735a808baa1ec78264f02011af3218fa2a995fdf999fe642e43fb50f8ccdabc2ebf1ff476b0b01c74cabfbce927"

RPROVIDES:${PN} += "application() \
application(thunar-bulk-rename.desktop) \
application(thunar-settings.desktop) \
application(thunar.desktop) \
config(thunar) \
libthunar-tpa.so()(64bit) \
metainfo() \
metainfo(org.xfce.thunar.appdata.xml) \
mimehandler(inode/directory) \
thunar \
thunar(aarch-64) \
thunar-doc"

RDEPENDS:${PN} += "/bin/sh \
exo-tools \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libexif.so.12()(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libthunarx-3.so.0()(64bit) \
libxfce4kbd-private-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
