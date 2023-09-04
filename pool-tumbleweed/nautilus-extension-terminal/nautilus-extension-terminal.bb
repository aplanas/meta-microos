SUMMARY = "Nautilus Extension to Open Terminal in Folders"
DESCRIPTION = "This is a nautilus extension that allows you to open a terminal in \
arbitrary folders."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.2"

RPM_NAME = "nautilus-extension-terminal-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "9d633ef53a59b8803fd22352858a238fed2f544583f44fd7502c821a0b4f0250c93e81b5bc2642dc8f66730137e526663b3ab0fd72059418990979637eec97e9"

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
