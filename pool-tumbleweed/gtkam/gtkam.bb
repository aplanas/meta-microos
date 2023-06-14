SUMMARY = "A GTK Digital Camera Tool"
DESCRIPTION = "GTKam is a GTK and GNOME based tool for accessing a digital camera, \
viewing thumbnails, and downloading pictures from the camera."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "gtkam-1.0-2.27.aarch64.rpm"
RPM_HASH = "1165d894d4e9d49ca0b3468e5abd295f3a650bcfb0ce5ac5290b0bf0d116ef5ab89ca069cf084ac0ead8d49c7e0829701e90155ad27da666d0e96b333d355955"

RPROVIDES:${PN} += "gtkam"

RDEPENDS:${PN} += "gtkam-lang \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif-gtk.so.5 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libgimp-2.0.so.0 \
libgimpui-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
