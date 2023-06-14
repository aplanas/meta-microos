SUMMARY = "Tool to Manage Flickr Accounts"
DESCRIPTION = "Frogr is a application for the GNOME desktop that allows users to \
manage their accounts in the Flickr image hosting website. It supports \
all the basic Flickr features, including uploading pictures, adding \
descriptions, setting tags and managing sets and groups pools."
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "frogr-1.7-1.7.aarch64.rpm"
RPM_HASH = "77f46f21cd9b3341d73c6d2b0eeb7634eec6520d10b8e9ec9245d5560a099102d4d6fff2789232e0054e8c4babd58e9ef9ca5a751109240ec9064eb2bc196f50"

RPROVIDES:${PN} += "frogr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexif.so.12 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2"

inherit rpm
