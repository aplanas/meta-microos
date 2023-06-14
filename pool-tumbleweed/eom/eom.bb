SUMMARY = "MATE Desktop graphics viewer"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "eom-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "3d1994c9768f19405b50908d615e066fef96c05d428552322a9e6fcc1ba1944ab14b17393e33240a624f8e69961d613a4de4ba871c4f67249261a0497cb461b0"

RPROVIDES:${PN} += "eom \
libfullscreen.so \
libreload.so \
libstatusbar-date.so \
mate-image-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libexempi.so.8 \
libexif.so.12 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libmate-desktop-2.so.17 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
librsvg-2.so.2 \
libxml2.so.2 \
libz.so.1 \
mate-desktop-gsettings-schemas"

inherit rpm
