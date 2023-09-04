SUMMARY = "Multipress input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method which allows text entry via the \
multi-press method, as on a mobile phone."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-multipress-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "ac8e8328f4b12ff3f37d7460b16460943a0dae1e6261f38463624f8fd6d308ea228c3e3b41f107d1449579ba6126cca22d82c8e420c96b64bd76103548e3b004"

RPROVIDES:${PN} += "config-gtk3-immodule-multipress \
gtk3-immodule-multipress"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
