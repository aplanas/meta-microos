SUMMARY = "Vietnamese input method for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package provides an input method for Vietnamese."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-immodule-vietnamese-3.24.38-2.1.aarch64.rpm"
RPM_HASH = "7c2904038dddfbcf90d755fdeec0037274584e6773dc2b86c8002bb17c5edc281c41c507ad149ad4423a60bf361decd0b575f68392d06842a482f9338671ecca"

RPROVIDES:${PN} += "gtk3-immodule-vietnamese \
locale-gtk3-vi"

RDEPENDS:${PN} += "gtk3 \
gtk3-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
