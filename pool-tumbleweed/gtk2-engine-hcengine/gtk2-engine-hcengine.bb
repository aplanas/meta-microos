SUMMARY = "HC GTK+ 2 Theme Engine"
DESCRIPTION = "The High Contrast engine is targeted for usability themes, such as the \
GNOME HighContrast theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-hcengine-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "6293204291087af2ba7f8022ba2c61683ea8451095e8fb6e2826c3af85076d59f6f751863bb7a553bf37c1c52e8c5e69184ae100fba4e91bbda3a5b22aa25fdd"

RPROVIDES:${PN} += "gtk2-engine-hcengine \
libhcengine.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
