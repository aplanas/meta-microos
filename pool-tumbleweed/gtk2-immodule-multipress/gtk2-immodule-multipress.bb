SUMMARY = "Multipress input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method which allows text entry via the \
multi-press method, as on a mobile phone."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-multipress-2.24.33-4.3.aarch64.rpm"
RPM_HASH = "8da1f3e943f506a39541703f9a40db91c26ca8a20ac23088e425938db1305e75ccfb93a61aa7711b6d78be3176ee64942643b28f880167ba3b0e78ed741a18ac"

RPROVIDES:${PN} += "config-gtk2-immodule-multipress \
gtk2-immodule-multipress"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
