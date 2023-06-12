SUMMARY = "Photo Manager for GNOME"
DESCRIPTION = "Shotwell is a digital photo organizer designed for the GNOME desktop \
environment. It allows you to import photos from disk or camera, \
organize them in various ways, view them in full-window or fullscreen \
mode, and export them to share with others."
LICENSE = "LGPL-2.1-or-later"

PV = "0.32.1"

RPM_NAME = "shotwell-0.32.1-1.1.aarch64.rpm"
RPM_HASH = "fe1c3a33000a5be9024c6ced639f2ad1553db0b57e22e57e597bcfdf785afffc463fc4a6f38d084eb0cdd14a19e7f6fecb0a11e81a16676b0bf5b0e0395f4126"

RPROVIDES:${PN} += "application() \
application(org.gnome.Shotwell-Profile-Browser.desktop) \
application(org.gnome.Shotwell-Viewer.desktop) \
application(org.gnome.Shotwell.desktop) \
libshotwell-authenticator.so.0()(64bit) \
libshotwell-plugin-common.so.0()(64bit) \
libshotwell-plugin-dev-1.0.so.0()(64bit) \
libshotwell-publishing.so()(64bit) \
libshotwell-transitions.so()(64bit) \
metainfo() \
metainfo(org.gnome.Shotwell.appdata.xml) \
mimehandler(image/avif) \
mimehandler(image/gif) \
mimehandler(image/heif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/jxl) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/webp) \
mimehandler(image/x-3fr) \
mimehandler(image/x-adobe-dng) \
mimehandler(image/x-arw) \
mimehandler(image/x-bay) \
mimehandler(image/x-bmp) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-cr3) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-cap) \
mimehandler(image/x-cr2) \
mimehandler(image/x-crw) \
mimehandler(image/x-dcr) \
mimehandler(image/x-dcraw) \
mimehandler(image/x-dcs) \
mimehandler(image/x-dng) \
mimehandler(image/x-drf) \
mimehandler(image/x-eip) \
mimehandler(image/x-erf) \
mimehandler(image/x-fff) \
mimehandler(image/x-fuji-raf) \
mimehandler(image/x-iiq) \
mimehandler(image/x-k25) \
mimehandler(image/x-kdc) \
mimehandler(image/x-mef) \
mimehandler(image/x-minolta-mrw) \
mimehandler(image/x-mos) \
mimehandler(image/x-mrw) \
mimehandler(image/x-nef) \
mimehandler(image/x-nikon-nef) \
mimehandler(image/x-nrw) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-orf) \
mimehandler(image/x-panasonic-raw) \
mimehandler(image/x-pef) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-png) \
mimehandler(image/x-ptx) \
mimehandler(image/x-pxn) \
mimehandler(image/x-r3d) \
mimehandler(image/x-raf) \
mimehandler(image/x-raw) \
mimehandler(image/x-rw2) \
mimehandler(image/x-rwl) \
mimehandler(image/x-rwz) \
mimehandler(image/x-sigma-x3f) \
mimehandler(image/x-sony-arw) \
mimehandler(image/x-sony-sr2) \
mimehandler(image/x-sony-srf) \
mimehandler(image/x-sr2) \
mimehandler(image/x-srf) \
mimehandler(image/x-x3f) \
mimehandler(x-content/image-dcf) \
shotwell \
shotwell(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libexif.so.12()(64bit) \
libgcr-base-3.so.1()(64bit) \
libgcr-ui-3.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgexiv2.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libportal-gtk3.so.1()(64bit) \
libportal.so.1()(64bit) \
libraw.so.23()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit)"

inherit rpm