SUMMARY = "Tool to Manage Flickr Accounts"
DESCRIPTION = "Frogr is a application for the GNOME desktop that allows users to \
manage their accounts in the Flickr image hosting website. It supports \
all the basic Flickr features, including uploading pictures, adding \
descriptions, setting tags and managing sets and groups pools."
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "frogr-1.7-1.7.aarch64.rpm"
RPM_HASH = "77f46f21cd9b3341d73c6d2b0eeb7634eec6520d10b8e9ec9245d5560a099102d4d6fff2789232e0054e8c4babd58e9ef9ca5a751109240ec9064eb2bc196f50"

RPROVIDES:${PN} += "application() \
application(org.gnome.frogr.desktop) \
frogr \
frogr(aarch-64) \
metainfo() \
metainfo(org.gnome.frogr.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/png) \
mimehandler(video/3gpp) \
mimehandler(video/avchd-stream) \
mimehandler(video/m2ts) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.dlna.mpeg-tts) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-msvideo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexif.so.12()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libsoup-2.4.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
