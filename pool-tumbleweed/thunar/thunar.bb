SUMMARY = "File Manager for the Xfce Desktop Environment"
DESCRIPTION = "Thunar is a file manager for the Xfce desktop environment. Its \
functionality can be extended through plugins. Thunar can also be \
extended by writing scripts to be placed in the context menu for \
various file types."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.6"

RPM_NAME = "thunar-4.18.6-1.1.aarch64.rpm"
RPM_HASH = "4905eff97739d9c8ef40f3a64351706af5693735a808baa1ec78264f02011af3218fa2a995fdf999fe642e43fb50f8ccdabc2ebf1ff476b0b01c74cabfbce927"

RPROVIDES:${PN} += "config-thunar \
libthunar-tpa.so \
thunar \
thunar-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
exo-tools \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpcre2-8.so.0 \
libthunarx-3.so.0 \
libxfce4kbd-private-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
