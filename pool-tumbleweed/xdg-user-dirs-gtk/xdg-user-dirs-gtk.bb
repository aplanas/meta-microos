SUMMARY = "Xdg-user-dir support for Gnome and Gtk+ applications"
DESCRIPTION = "A companion to xdg-user-dirs that integrates it into the Gnome desktop \
and Gtk+ applications. Presents a dialog when a user changes locales \
to help move they standard user directories to the correct names."
LICENSE = "GPL-2.0-or-later"

PV = "0.11"

RPM_NAME = "xdg-user-dirs-gtk-0.11-2.1.aarch64.rpm"
RPM_HASH = "c5655d9473f07dd17f7fb3d80e4485c4354beae394eae43dd92a34290957d82d400f336f2276083136b67067131ff1eaa79c52df45f8f200e3edabe88c06dc10"

RPROVIDES:${PN} += "xdg-user-dirs-gtk \
xdg-user-dirs-gtk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
xdg-user-dirs"

inherit rpm
