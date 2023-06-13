SUMMARY = "Ncurses based file manager with vi like keybindings"
DESCRIPTION = "Vifm is a ncurses based file manager with vi like keybindings that allow complete \
keyboard control over your files without having to learn a new set of commands. \
It supports UTF-8, a quick file view similar to midnight commander's quick view, \
and configurable color schemes."
LICENSE = "GPL-2.0-or-later"

PV = "0.13"

RPM_NAME = "vifm-0.13-1.1.aarch64.rpm"
RPM_HASH = "9b1c8b421cf5fbb4f3343b91244e2271a7e3f21b8fb7f8f05d243ff0912b5f773963ca67581f839e3914b20fcda86cb69e5aa1412325e0f2f8b135edcc3610fc"

RPROVIDES:${PN} += "application() \
application(vifm.desktop) \
mimehandler(inode/directory) \
vifm \
vifm(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libmagic.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
