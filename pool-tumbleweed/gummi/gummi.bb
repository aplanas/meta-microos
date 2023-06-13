SUMMARY = "Simple LaTeX editor"
DESCRIPTION = "Gummi is a LaTeX editor written using the GTK+ toolkit. It was designed with \
simplicity in mind, but is useful for both novice and advanced LaTeX writers."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "gummi-0.8.3-1.6.aarch64.rpm"
RPM_HASH = "6d685289cdaf9f8b53956ed6f3d7bfefbaefb6353676f7f0711431f7f805b504c6b7225deee61eac212d084ffd10c0b49f15a3242c0453ec82c25dc50886badd"

RPROVIDES:${PN} += "application() \
application(gummi.desktop) \
gummi \
gummi(aarch-64) \
mimehandler(text/x-tex)"

RDEPENDS:${PN} += "/bin/sh \
gtkspell \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libgtkspell3-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpoppler-glib.so.8()(64bit) \
libsynctex.so.2()(64bit) \
texlive-latex"

inherit rpm
