SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "libgitg-ext-1_0-0-41-2.10.aarch64.rpm"
RPM_HASH = "8162fb4555b881aa09fd0680c0c3cc23888e35030fdf424f316b8f884ccf757f48ada2ceff743465461b8e90932d35d5c2dce5add05ddb83785279dc1a42a047"

RPROVIDES:${PN} += "libgitg-ext-1-0-0 \
libgitg-ext-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgitg-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
