SUMMARY = "HC GTK+ 2 Theme Engine"
DESCRIPTION = "The High Contrast engine is targeted for usability themes, such as the \
GNOME HighContrast theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-hcengine-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "6293204291087af2ba7f8022ba2c61683ea8451095e8fb6e2826c3af85076d59f6f751863bb7a553bf37c1c52e8c5e69184ae100fba4e91bbda3a5b22aa25fdd"

RPROVIDES:${PN} += "gtk2-engine-hcengine \
gtk2-engine-hcengine(aarch-64) \
libhcengine.so()(64bit)"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
