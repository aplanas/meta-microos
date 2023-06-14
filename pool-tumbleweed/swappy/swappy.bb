SUMMARY = "Wayland compositor screenshot editor"
DESCRIPTION = "A Wayland native snapshot and editor tool"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "swappy-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "fa2b4c96d870a7abbe12a4140e3755804f94e51293e1b273cc06273f65624da56e0b812659a9fee2ae8867bee88fcd523abe793ab0423098c5ba219642d9cad0"

RPROVIDES:${PN} += "swappy"

RDEPENDS:${PN} += "fontawesome-fonts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
