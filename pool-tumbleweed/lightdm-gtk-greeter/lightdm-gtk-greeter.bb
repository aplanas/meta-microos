SUMMARY = "Simple display manager (GTK+ greeter)"
DESCRIPTION = "A LightDM greeter that uses the GTK+ toolkit. \
This is the reference implementation of a LightDM greeter based on the Gtk \
toolkit."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "lightdm-gtk-greeter-2.0.8-1.13.aarch64.rpm"
RPM_HASH = "3a8fc6dff92725ad100db9ed2ba222eca59b969a174e4053d019001e58516303f5a197e8ccca734a44f7113c86b32a3f48fa94381c90977ae55d0d611e103dd2"

RPROVIDES:${PN} += "lightdm-greeter \
lightdm-gtk-greeter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblightdm-gobject-1.so.0 \
libm.so.6 \
lightdm \
lightdm-gtk-greeter-branding \
update-alternatives"

inherit rpm
