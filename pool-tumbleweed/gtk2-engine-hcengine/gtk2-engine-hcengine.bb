SUMMARY = "HC GTK+ 2 Theme Engine"
DESCRIPTION = "The High Contrast engine is targeted for usability themes, such as the \
GNOME HighContrast theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-hcengine-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "c73696c7f60bc3193789f4e6181c00e5a59c55a335296ba52bd6674ec93d9b89fd696b8d10fd6c9dd0d5d62a246cea5e81d5ed39cdbdc6900d5c28fcc8039f27"

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
