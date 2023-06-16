SUMMARY = "The LXDE file manager"
DESCRIPTION = "A file manager with tabbed browsing. It's also the \
LXDE default file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "pcmanfm-1.3.2-2.7.aarch64.rpm"
RPM_HASH = "12bac9db3b8f89a6c5f6f1498d18a6f0e871478cefeccd0b82cfea22f416c73dd144c6bfef07586f5fccf24fa0220aef4d640d77fea3994e98a2e5bd845c36ba"

RPROVIDES:${PN} += "config-pcmanfm \
pcmanfm"

RDEPENDS:${PN} += "/usr/bin/sh \
gvfs \
gvfs-backends \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfm \
libfm-gtk.so.4 \
libfm.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
menu-cache \
polkit-gnome \
xdg-utils"

inherit rpm
