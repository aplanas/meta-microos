SUMMARY = "Nautilus Extension to Open Terminal in Folders"
DESCRIPTION = "This is a nautilus extension that allows you to open a terminal in \
arbitrary folders."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.1"

RPM_NAME = "nautilus-extension-terminal-3.48.1-1.2.aarch64.rpm"
RPM_HASH = "bc866571027134fb8fcffb0996cb9cb9a2496a03ee9fcdd7541cd06a85c28bcc8f5537055b188dd8a545580be603fbd3a6a491046c7b4b292b469204d551d7ba"

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
