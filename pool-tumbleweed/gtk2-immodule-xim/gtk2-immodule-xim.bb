SUMMARY = "X input method for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method based on the X Input Method."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-immodule-xim-2.24.33-4.4.aarch64.rpm"
RPM_HASH = "298476e77ebdc987c665faefe0600f796c997cf0fd7dcec30c80138049d395aa20cb95e075bca11f49ddd7017ca8fdc7e11755f35979000a6275d51d20a240a8"

RPROVIDES:${PN} += "gtk2-immodule-xim \
locale-gtk2-ja \
locale-gtk2-ko \
locale-gtk2-th \
locale-gtk2-zh"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
gtk2-tools \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
