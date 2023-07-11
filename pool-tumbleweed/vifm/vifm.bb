SUMMARY = "Ncurses based file manager with vi like keybindings"
DESCRIPTION = "Vifm is a ncurses based file manager with vi like keybindings that allow complete \
keyboard control over your files without having to learn a new set of commands. \
It supports UTF-8, a quick file view similar to midnight commander's quick view, \
and configurable color schemes."
LICENSE = "GPL-2.0-or-later"

PV = "0.13"

RPM_NAME = "vifm-0.13-1.2.aarch64.rpm"
RPM_HASH = "1559d595a3100ad3a041750a80110ae3464181176dbb870814dce8c3b9fef91c25c0be5e267d3d355375039c3ddf27906fc25b705dfe081e3b1a0baaba061657"

RPROVIDES:${PN} += "vifm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmagic.so.1 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
