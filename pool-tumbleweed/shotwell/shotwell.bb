SUMMARY = "Photo Manager for GNOME"
DESCRIPTION = "Shotwell is a digital photo organizer designed for the GNOME desktop \
environment. It allows you to import photos from disk or camera, \
organize them in various ways, view them in full-window or fullscreen \
mode, and export them to share with others."
LICENSE = "LGPL-2.1-or-later"

PV = "0.32.1"

RPM_NAME = "shotwell-0.32.1-1.2.aarch64.rpm"
RPM_HASH = "3dcb6b24fc5cb5032cebfba3da01a550921e6157d0a12e220eb44843f9424f730f87b2c1c5e982af57700b8cdc9717390dadbfce3baa6a47ccdf8ccba6f70ce4"

RPROVIDES:${PN} += "libshotwell-authenticator.so.0 \
libshotwell-plugin-common.so.0 \
libshotwell-plugin-dev-1.0.so.0 \
libshotwell-publishing.so \
libshotwell-transitions.so \
shotwell"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexif.so.12 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libportal-gtk3.so.1 \
libportal.so.1 \
libraw.so.23 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libwebkit2gtk-4.1.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libxml2.so.2"

inherit rpm
