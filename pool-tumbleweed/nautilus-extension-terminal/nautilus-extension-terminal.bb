SUMMARY = "Nautilus Extension to Open Terminal in Folders"
DESCRIPTION = "This is a nautilus extension that allows you to open a terminal in \
arbitrary folders."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "nautilus-extension-terminal-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "a5f5d39adfafdab419b70c9f077b49cc1623d27a08f52ecf4f446c3a8b547727a2f8f7e676d5dcd05ef0f3833006ee5fef9700c15cc4dc4512f54fce374d1f37"

RPROVIDES:${PN} += "libterminal-nautilus.so. \
nautilus-extension-terminal \
nautilus-open-terminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libstdc++.so.6"

inherit rpm
