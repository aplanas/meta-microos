SUMMARY = "Command-line tools for use inside Flatpak sandboxes"
DESCRIPTION = "This package contains a number of command-line utilities for use inside \
Flatpak sandboxes. They work by talking to portals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "flatpak-xdg-utils-1.0.5-2.5.aarch64.rpm"
RPM_HASH = "a49cfa495ce6f5ac59158355e7d12d49bfab744c520514400a470a2e203462f4087b9a980f4fd7432d86bb551248f4ff93f317813fea41a432441cd03b7b7b5e"

RPROVIDES:${PN} += "flatpak-xdg-utils"

RDEPENDS:${PN} += "flatpak-spawn \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
